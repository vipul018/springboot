
# springboot
A repository to track my SpringBoot learning

---
### Tomcat Error
**tomcat port out of range -1**
To solve this, change:
`<Server port="-1" shutdown="SHUTDOWN">` to `<Server port="8005" shutdown="SHUTDOWN">` in file `tomcat{x}/conf/server.xml`