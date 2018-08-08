package com.spring.queries;

public class QueryBuilder {

	public static final String NJ_GET_ALL = "SELECT * FROM USER";

	public static final String NJ_INSERT = "INSERT INTO USER(USER_ID, EMAIL,PASSWORD) VALUES(:K_USER_ID,:K_EMAIL,:K_PASSWORD)";

	public static final String NJ_GET_USER_BY_ID = "SELECT * FROM USER  WHERE USER_ID =:K_USER_ID";

	public static final String NJ_DELETE_USER_BY_ID = "DELETE FROM USER  WHERE USER_ID= :K_USER_ID";

	public static final String NJ_DELETE_ALL = "DELETE FROM USER";

	public static final String NJ_UPDATE_USER_BY_ID = "UPDATE USER SET EMAIL = :K_EMAIL WHERE USER_ID =:K_USER_ID";

	public static final String NJR_GET_ALL = "SELECT * FROM ROLE";

	public static final String NJR_INSERT = "INSERT INTO ROLE(ROLE_ID,RNAME,RCODE) VALUES(:K_ROLE_ID,:K_RNAME,:K_RCODE)";

	public static final String NJR_GET_ROLE_BY_ID = "SELECT * FROM ROLE WHERE ROLE_ID=:K_ROLE_ID";

	public static final String NJR_DELETE_ROLE_BY_ID = "DELETE FROM ROLE WHERE ROLE_ID=:K_ROLE_ID";

	public static final String NJR_DELETE_ALL = "DELETE FROM ROLE";

	public static final String NJR_UPDATE_ROLE_BY_ID = "UPDATE ROLE SET CODE=code WHERE ROLE_ID=:K_ROLE_ID";

	public static final String NJO_GET_ALL = "SELECT * FROM ORGANIZATION";

	public static final String NJO_INSERT = "INSERT INTO ORGANIZATION(ORG_ID,ORG_NAME,ORG_CODE) VALUES(:K_ORG_ID,:K_ORG_NAME,:K_ORG_CODE)";

	public static final String NJO_GET_ORG_BY_ID = "SELECT * FROM ORGANIZATION WHERE ORG_ID=:K_ORG_ID";

	public static final String NJO_DELETE_ORG_BY_ID = "DELETE FROM ORGANIZATION WHERE ORG_ID=:K_ORG_ID";

	public static final String NJO_DELETE_ALL = "DELETE FROM ORGANIZATION";

	public static final String NJO_UPDATE_ORG_BY_ID = "UPDATE ORGANIZATION SET NAME=org_name WHERE ORG_ID=:K_ORG_ID";
}
