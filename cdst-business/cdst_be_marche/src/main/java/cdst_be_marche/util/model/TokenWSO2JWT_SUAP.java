package cdst_be_marche.util.model;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;





/**
{
	"http:\/\/wso2.org\/claims\/userid": "22a12a77-f161-45d6-8dd4-d391c84739b9",
	"http:\/\/wso2.org\/claims\/username": "DLCGDU71D16C632S",
	"http:\/\/wso2.org\/claims\/role": "Internal\/everyone",
	"http:\/\/wso2.org\/claims\/applicationtier": "Unlimited",
	"http:\/\/wso2.org\/claims\/keytype": "PRODUCTION",
	"http:\/\/wso2.org\/claims\/version": "1.0",
	"iss": "wso2.org\/products\/am",
	"http:\/\/wso2.org\/claims\/applicationname": "MeetPadSuap",
	"http:\/\/wso2.org\/claims\/enduser": "DLCGDU71D16C632S@carbon.super",
	"http:\/\/wso2.org\/claims\/enduserTenantId": "-1234",
	"http:\/\/wso2.org\/claims\/resourceType": "User",
	"http:\/\/wso2.org\/claims\/created": "2018-12-18T18:14:08Z",
	"http:\/\/wso2.org\/claims\/modified": "2018-12-18T18:14:08Z",
	"http:\/\/wso2.org\/claims\/subscriber": "admin",
	"http:\/\/wso2.org\/claims\/tier": "Unlimited",
	"exp": 1545404683,
	"http:\/\/wso2.org\/claims\/applicationid": "3",
	"http:\/\/wso2.org\/claims\/usertype": "APPLICATION_USER",
	"http:\/\/wso2.org\/claims\/apicontext": "\/cdst_be_suap\/1.0",
	"http:\/\/wso2.org\/claims\/userprincipal": "DLCGDU71D16C632S"
}
 * @author arosina
 *
 */
public class TokenWSO2JWT_SUAP implements Serializable {
	

	@JsonProperty("http://wso2.org/claims/userid")	
	private String userid;
	@JsonProperty("http://wso2.org/claims/username")
	private String username;
	@JsonProperty("http://wso2.org/claims/role")
	private String role;
	@JsonProperty("http://wso2.org/claims/applicationtier")
	private String applicationtier;
	@JsonProperty("http://wso2.org/claims/keytype")
	private String keytype;
	@JsonProperty("http://wso2.org/claims/version")
	private String version;
	
	@JsonIgnoreProperties
	@JsonProperty("iss")
	private String iss;

	
	@JsonProperty("http://wso2.org/claims/am")
	private String am;
	@JsonProperty("http://wso2.org/claims/applicationname")
	private String applicationname;
	@JsonProperty("http://wso2.org/claims/enduser")
	private String enduser;
	@JsonProperty("http://wso2.org/claims/enduserTenantId")
	private String enduserTenantId;
	@JsonProperty("http://wso2.org/claims/resourceType")
	private String resourceType;
	@JsonProperty("http://wso2.org/claims/created")
	private String created;
	@JsonProperty("http://wso2.org/claims/modified")
	private String modified;
	@JsonProperty("http://wso2.org/claims/subscriber")
	private String subscriber;
	@JsonProperty("http://wso2.org/claims/tier")
	private String tier;
	
	@JsonIgnoreProperties
	@JsonProperty("exp")
	private String exp;
	@JsonProperty("http://wso2.org/claims/applicationid")
	private String applicationid;
	@JsonProperty("http://wso2.org/claims/usertype")
	private String usertype;
	@JsonProperty("http://wso2.org/claims/apicontext")
	private String apicontext;
	@JsonProperty("http://wso2.org/claims/userprincipal")
	private String userprincipal;
	
	
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getApplicationtier() {
		return applicationtier;
	}
	public void setApplicationtier(String applicationtier) {
		this.applicationtier = applicationtier;
	}
	public String getKeytype() {
		return keytype;
	}
	public void setKeytype(String keytype) {
		this.keytype = keytype;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getAm() {
		return am;
	}
	public void setAm(String am) {
		this.am = am;
	}
	public String getApplicationname() {
		return applicationname;
	}
	public void setApplicationname(String applicationname) {
		this.applicationname = applicationname;
	}
	public String getEnduser() {
		return enduser;
	}
	public void setEnduser(String enduser) {
		this.enduser = enduser;
	}
	public String getEnduserTenantId() {
		return enduserTenantId;
	}
	public void setEnduserTenantId(String enduserTenantId) {
		this.enduserTenantId = enduserTenantId;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public String getSubscriber() {
		return subscriber;
	}
	public void setSubscriber(String subscriber) {
		this.subscriber = subscriber;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getApplicationid() {
		return applicationid;
	}
	public void setApplicationid(String applicationid) {
		this.applicationid = applicationid;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getApicontext() {
		return apicontext;
	}
	public void setApicontext(String apicontext) {
		this.apicontext = apicontext;
	}
	public String getUserprincipal() {
		return userprincipal;
	}
	public void setUserprincipal(String userprincipal) {
		this.userprincipal = userprincipal;
	}
	

	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * Ritorna l'oggetto TokenJWT come Stringa
	 * @return
	 * @throws JsonProcessingException
	 */
	public String getJsonString() 
			throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(this); 		
	} 	
	
	/**
	 * 
	 * @param sJson
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static TokenWSO2JWT_SUAP getObj(String sJson) 
			throws JsonParseException, JsonMappingException, IOException {		
		ObjectMapper mapper = new ObjectMapper();
		return  mapper.readValue(sJson, TokenWSO2JWT_SUAP.class);
	}
	
	
	
	
}
