import org.jahia.services.mail.MailSettings
import org.jahia.services.mail.MailService

MailSettings mailSettings = new MailSettings()
mailSettings.setServiceActivated(true)
mailSettings.setUri(System.getenv("SMTP_SERVER_URL"))
mailSettings.setFrom("noreply@smtp-server.localhost")
mailSettings.setTo("admin@smtp-server.localhost")

MailService.getInstance().store(mailSettings)
