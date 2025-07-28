def json = new groovy.json.JsonSlurper().parseText(message.getBody(String))
json.customerName = json.customerName ?: "Unknown"
message.setBody(new groovy.json.JsonBuilder(json).toString())
return message
