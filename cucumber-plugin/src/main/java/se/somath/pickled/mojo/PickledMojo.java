package se.somath.pickled.mojo;

import org.apache.maven.model.Build;
import org.apache.maven.model.Resource;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;
import se.somath.pickled.Main;

import java.util.List;
import java.util.Map;

/**
 * @goal publish
 * @phase generate-resources
 */
public class PickledMojo extends AbstractMojo {
    public void execute() throws MojoExecutionException {


        Map pluginContext = getPluginContext();
        MavenProject mavenProject = (MavenProject) pluginContext.get("project");
        Build build = mavenProject.getBuild();
        String targetDirectory = build.getDirectory();
        List<Resource> resources = build.getResources();
        int first = 0;
        Resource resource = resources.get(first);
        String sourceDirectory = resource.getDirectory();

        Main main = new Main(getLog());

        main.publish();

    }
}
