/**
* @author <a href='mailto:donbeave@gmail.com'>Alexey Zhokhov</a>
*/
class SpringSecurityOauthVkontakteGrailsPlugin {

    def version = "0.1.1"
    def grailsVersion = "1.2.2 > *"
    def dependsOn = [springSecurityOauth: '2.0.2 > *']
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "VK for Spring Security OAuth plugin"
    def author = "Alexey Zhokhov"
    def authorEmail = "donbeave@gmail.com"
    def description = '''\
Integrate [VK|http://www.vk.com] to [Spring Security OAuth plugin|http://grails.org/plugin/spring-security-oauth].
'''

    def documentation = "https://github.com/donbeave/grails-spring-security-oauth-vkontakte"

    def license = "APACHE"

    def developers = [[name: "Alexey Zhokhov", email: "donbeave@gmail.com"]]

    def scm = [url: 'https://github.com/donbeave/grails-spring-security-oauth-vkontakte']

}
