# jahia-qa-data
resources for jahia quality team

This repo can be use to store usefull data for qa such as saved website, configuration files, provisionning files, ... 

## How to use provisioning-files folder: 
- select the provisioning file for the module and jahia version you want to test
- copy it in a gist file https://gist.github.com
- save the gist file as public gist
- click on raw button
- copy the url
- access the module you want to test on github https://github.com/Jahia/
- select tab "action"
- for almost all supported module we have a "manual run workflow" 
- Select it and click on"run workflow"
- select the tag or branch on which you want to execute the tests
- set the expected jahia version 
- in field "provisionning" paste the url previously copied
- set other parameters if avalable (cluster, jcustomer, version, ...)
- run the tests


## How to use website folder : 
- select the folder of website you want to import
- using execute provisioning for the jahia version you want to use
- access /jahia/administration/webProjectSettings 
- import the zipped website from the UI using "import archive"