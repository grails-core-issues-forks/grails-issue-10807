package issue10807

class BootStrap {

    def grailsApplication

    def init = { servletContext ->
        println grailsApplication.config.getProperty('logging.config')
    }
    def destroy = {
    }
}
