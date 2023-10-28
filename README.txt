Execution: please make sure your nodeVPN is connected in other to get access to "https://inte-smt.savanainc.com/nGageBanking/Login.aspx"

Primis Environment Setup
- Install "NordVPN" -> contact 'Derick Mullis - derick.mullis@levvel.io'
- Get AWS Credentials -> contact 'Satish Upadhyay - satish.upadhyay@levvel.io' for New User Credentials
	*Console Login Link -> https://sonabankorganizationaccount.signin.aws.amazon.com/console - 
- Setup MFA in AWS -> https://www.youtube.com/watch?v=FUXy2t28oqc
- Setup AWS CLI for CodeCommit -> https://docs.google.com/document/d/1IBjhex1WXJANp5Bm3AUhm9lnz_4BbH95KJIvwl1ZhpA/edit
- Setup Savana -> Primis Dev environment access - contact 'sonny.werghis@levvel.io'

Links To Important Documentations
- Sonabank Joint Kickoff -> https://docs.google.com/presentation/d/14l9FNV2E8OpiXGdPMkW6G2927Nk9H_L9qR1bT-WaGCU/edit#slide=id.gaf7d618be2_0_336
- DAO Walkthrough for Primis Bank (Apiture) - https://drive.google.com/file/d/177_bk_5AnqrWJcf3hS3Hdjm4lWKlaSJu/view?usp=drive_web
- BAM Batch Job Tech Specs -> https://docs.google.com/document/d/1hicwJ9PRXqv8V52I4szE-d47P_es0jKjuDkki01INMY/edit
                           -> https://docs.google.com/document/d/1hicwJ9PRXqv8V52I4szE-d47P_es0jKjuDkki01INMY/edit
- ACH Batch Job Tech Specs -> https://docs.google.com/document/d/1nKGVmolYKjYZqxozgEbgB4S4U17auWCpwhe5H-udKLY/edit
- Finxact Data Loader Tech Specs -> https://docs.google.com/document/d/1c9s1L63Mc4R7qXC_7o_oN47dtDmi-q0u5MKBKwq1utE/edit
.........................................
Automation Installations:
- Install "Java JDK" -> https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
- Install "Maven" -> https://www.baeldung.com/install-maven-on-windows-linux-mac
- Install "Eclipse IDE for Enterprise Java and Web Developers" -> https://www.eclipse.org/downloads/packages/installer
- Install "Cucumber Eclipse Plugin" from Eclipse -> help -> Eclipse market place
- Install "Git" -> https://git-scm.com/downloads
- Clone Automation Project: git clone https://git-codecommit.us-east-1.amazonaws.com/v1/repos/e2e_automation
- Install "Postman app" -> https://www.postman.com/downloads/
.........................................
Import the project
- In Eclipse, select File > Import… ​
- In the import window, expand Maven, select Existing Maven Projects, and click Next:
- Click Browse and select the directory that contains the pom.xml file of the project you want to import: Note. ...
- Click Finish.
.........................................
The Primis Dev environment is ready for us to use. Here are relevant URLs and credentials

a) Finxact Console URL: https://console-server.dev-10.finxact.io/
b) Savana URL: https://inte-smt.savanainc.com/nGageBanking/Login.aspx
c) Postman settings: 
   API Endpoint: http://455392.dev-10.finxact.io
   API Client Id: 997fa47d93e4cc9a7a58699a264216838c2963040544c8966ff90ba49dde1a
   API Client Secret: bd089037403e119ce5067a95

If you don't have an account for Finxact and/or Savana and would like one, please let me know. 

The Finxact Test Data Generator has been updated to create data in this environment. Please clone/sync the latest version of the generator from this URL:
https://git-codecommit.us-east-1.amazonaws.com/v1/repos/finxact-test-data-gen-go
..........................................