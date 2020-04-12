package hello

println "hello groovy"

greetingNoDef = "hello groovy noDef"
println greetingNoDef

def greetingDef = "hello groovy Def"
println greetingDef

def a = 2
printf "%s - %s%n", a.getClass().getName(), a

a = "hi"
printf "%s - %s%n", a.getClass().getName(), a

b = 2
printf "%s - %s%n", b.getClass().getName(), b

b = "hi"
printf "%s - %s%n", b.getClass().getName(), b
