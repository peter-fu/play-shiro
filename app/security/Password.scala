package security

import org.jasypt.digest._
import org.jasypt.digest.config._
import org.jasypt.util.password.{StrongPasswordEncryptor, PasswordEncryptor}

/**
 * A password encryptor that passes through to the string digester on the backend.
 */
object Password
{
  lazy val passwordEncryptor = new StrongPasswordEncryptor()

  def checkPassword(message: String, digest: String) = passwordEncryptor.checkPassword(message, digest)

  def encryptPassword(p1: String) = passwordEncryptor.encryptPassword(p1)
}