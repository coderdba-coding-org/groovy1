package hello

import groovy.util.logging.Slf4j

// Use annotation to inject log field into the class.
@Slf4j
class HelloWorldSlf4j {
    def execute() {
        log.debug 'say sth with debug words'
        log.info 'say sth with info words.'
    }
}

def helloWorld = new HelloWorldSlf4j()
helloWorld.execute()