# 1. SVN password cache clear #

Assuming that you're using Eclipse, and you've already saved password/username for a SVN repository. Now to change the username & password, you must delete the SVN cache file first:

+ If you're using Subclipse/Subversive plugin, the file is ".keyring" in your **$ECLIPSE\_HOME/configuration/org.eclipse.core.runtime/** directory

+ On some Linux distribution, in which Eclipse can be installed from its own repository, the cache file is ".keyring" , but in user home directory, not in the standalone Eclipse dir: **$HOME/.eclipse/org.eclipse.platform\_3..../configuration/org.eclipse.core.runtime/** , sometimes it's in **$HOME/.subversion/auth** (~/.subversion/auth)

+ On Mac OSX, besides those locations, it can be ".eclipse\_keyring" at either **$HOME/** or **/** (root) directory, depending on the version

+ On Windows, besides those locations, it can be located in "auth" folder (either **%APPDATA%\Subversion\auth** or **%APPDATA%\Roaming\Subversion\auth**)

+ A few Eclipse-based IDEs may have its own cache file for SVN, such as "~/.Aptana/Aptana Studio/configuration/org.eclipse.core.runtime" .


# 2. TBD #