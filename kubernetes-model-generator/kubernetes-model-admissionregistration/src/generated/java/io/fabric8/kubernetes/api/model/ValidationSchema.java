
package io.fabric8.kubernetes.api.model;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.admissionregistration.v1.Rule;
import io.fabric8.kubernetes.api.model.admissionregistration.v1.RuleWithOperations;
import io.fabric8.kubernetes.api.model.authentication.TokenRequest;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.kubernetes.api.model.version.Info;

@Generated("jsonschema2pojo")
public class ValidationSchema {

    private APIGroup aPIGroup;
    private APIGroupList aPIGroupList;
    private KubernetesList baseKubernetesList;
    private CreateOptions createOptions;
    private DeleteOptions deleteOptions;
    private GetOptions getOptions;
    private Info info;
    private io.fabric8.kubernetes.api.model.authorization.v1.LocalSubjectAccessReview k8sLocalSubjectAccessReview;
    private io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReview k8sSubjectAccessReview;
    private ListOptions listOptions;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhookConfiguration mutatingWebhookConfiguration;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhookConfigurationList mutatingWebhookConfigurationList;
    private ObjectMeta objectMeta;
    private Patch patch;
    private PatchOptions patchOptions;
    private Quantity quantity;
    private RootPaths rootPaths;
    private Rule rule;
    private RuleWithOperations ruleWithOperations;
    private io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectAccessReview selfSubjectAccessReview;
    private io.fabric8.kubernetes.api.model.authentication.v1alpha1.SelfSubjectReview selfSubjectReview;
    private io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectRulesReview selfSubjectRulesReview;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ServiceReference serviceReference;
    private Status status;
    private String time;
    private TokenRequest tokenRequest;
    private TokenReview tokenReview;
    private TypeMeta typeMeta;
    private UpdateOptions updateOptions;
    private io.fabric8.kubernetes.api.model.admission.v1.AdmissionRequest v1AdmissionRequest;
    private io.fabric8.kubernetes.api.model.admission.v1.AdmissionResponse v1AdmissionResponse;
    private io.fabric8.kubernetes.api.model.admission.v1.AdmissionReview v1AdmissionReview;
    private io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionRequest v1Beta1AdmissionRequest;
    private io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionResponse v1Beta1AdmissionResponse;
    private io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionReview v1Beta1AdmissionReview;
    private String v1Beta1Operation;
    private String v1Beta1PatchType;
    private io.fabric8.kubernetes.api.model.authentication.v1beta1.SelfSubjectReview v1Beta1SelfSubjectReview;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicy v1Beta1ValidatingAdmissionPolicy;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBinding v1Beta1ValidatingAdmissionPolicyBinding;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBindingList v1Beta1ValidatingAdmissionPolicyBindingList;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyList v1Beta1ValidatingAdmissionPolicyList;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfiguration v1MutatingWebhookConfiguration;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfigurationList v1MutatingWebhookConfigurationList;
    private String v1Operation;
    private String v1PatchType;
    private Rule v1Rule;
    private RuleWithOperations v1RuleWithOperations;
    private io.fabric8.kubernetes.api.model.authentication.SelfSubjectReview v1SelfSubjectReview;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1.ServiceReference v1ServiceReference;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicy v1ValidatingAdmissionPolicy;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBinding v1ValidatingAdmissionPolicyBinding;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBindingList v1ValidatingAdmissionPolicyBindingList;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyList v1ValidatingAdmissionPolicyList;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhookConfiguration v1ValidatingWebhookConfiguration;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhookConfigurationList v1ValidatingWebhookConfigurationList;
    private io.fabric8.kubernetes.api.model.authorization.v1beta1.LocalSubjectAccessReview v1beta1K8sLocalSubjectAccessReview;
    private io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectAccessReview v1beta1K8sSubjectAccessReview;
    private io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectAccessReview v1beta1SelfSubjectAccessReview;
    private io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectRulesReview v1beta1SelfSubjectRulesReview;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicy validatingAdmissionPolicies;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyList validatingAdmissionPoliciesList;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBinding validatingAdmissionPolicyBinding;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBindingList validatingAdmissionPolicyBindingList;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhookConfiguration validatingWebhookConfiguration;
    private io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhookConfigurationList validatingWebhookConfigurationList;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ValidationSchema() {
    }

    public ValidationSchema(APIGroup aPIGroup, APIGroupList aPIGroupList, KubernetesList baseKubernetesList, CreateOptions createOptions, DeleteOptions deleteOptions, GetOptions getOptions, Info info, io.fabric8.kubernetes.api.model.authorization.v1.LocalSubjectAccessReview k8sLocalSubjectAccessReview, io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReview k8sSubjectAccessReview, ListOptions listOptions, io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhookConfiguration mutatingWebhookConfiguration, io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhookConfigurationList mutatingWebhookConfigurationList, ObjectMeta objectMeta, Patch patch, PatchOptions patchOptions, Quantity quantity, RootPaths rootPaths, Rule rule, RuleWithOperations ruleWithOperations, io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectAccessReview selfSubjectAccessReview, io.fabric8.kubernetes.api.model.authentication.v1alpha1.SelfSubjectReview selfSubjectReview, io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectRulesReview selfSubjectRulesReview, io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ServiceReference serviceReference, Status status, String time, TokenRequest tokenRequest, TokenReview tokenReview, TypeMeta typeMeta, UpdateOptions updateOptions, io.fabric8.kubernetes.api.model.admission.v1.AdmissionRequest v1AdmissionRequest, io.fabric8.kubernetes.api.model.admission.v1.AdmissionResponse v1AdmissionResponse, io.fabric8.kubernetes.api.model.admission.v1.AdmissionReview v1AdmissionReview, io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionRequest v1Beta1AdmissionRequest, io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionResponse v1Beta1AdmissionResponse, io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionReview v1Beta1AdmissionReview, String v1Beta1Operation, String v1Beta1PatchType, io.fabric8.kubernetes.api.model.authentication.v1beta1.SelfSubjectReview v1Beta1SelfSubjectReview, io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicy v1Beta1ValidatingAdmissionPolicy, io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBinding v1Beta1ValidatingAdmissionPolicyBinding, io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBindingList v1Beta1ValidatingAdmissionPolicyBindingList, io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyList v1Beta1ValidatingAdmissionPolicyList, io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfiguration v1MutatingWebhookConfiguration, io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfigurationList v1MutatingWebhookConfigurationList, String v1Operation, String v1PatchType, Rule v1Rule, RuleWithOperations v1RuleWithOperations, io.fabric8.kubernetes.api.model.authentication.SelfSubjectReview v1SelfSubjectReview, io.fabric8.kubernetes.api.model.admissionregistration.v1.ServiceReference v1ServiceReference, io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicy v1ValidatingAdmissionPolicy, io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBinding v1ValidatingAdmissionPolicyBinding, io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBindingList v1ValidatingAdmissionPolicyBindingList, io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyList v1ValidatingAdmissionPolicyList, io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhookConfiguration v1ValidatingWebhookConfiguration, io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhookConfigurationList v1ValidatingWebhookConfigurationList, io.fabric8.kubernetes.api.model.authorization.v1beta1.LocalSubjectAccessReview v1beta1K8sLocalSubjectAccessReview, io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectAccessReview v1beta1K8sSubjectAccessReview, io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectAccessReview v1beta1SelfSubjectAccessReview, io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectRulesReview v1beta1SelfSubjectRulesReview, io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicy validatingAdmissionPolicies, io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyList validatingAdmissionPoliciesList, io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBinding validatingAdmissionPolicyBinding, io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBindingList validatingAdmissionPolicyBindingList, io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhookConfiguration validatingWebhookConfiguration, io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhookConfigurationList validatingWebhookConfigurationList) {
        super();
        this.aPIGroup = aPIGroup;
        this.aPIGroupList = aPIGroupList;
        this.baseKubernetesList = baseKubernetesList;
        this.createOptions = createOptions;
        this.deleteOptions = deleteOptions;
        this.getOptions = getOptions;
        this.info = info;
        this.k8sLocalSubjectAccessReview = k8sLocalSubjectAccessReview;
        this.k8sSubjectAccessReview = k8sSubjectAccessReview;
        this.listOptions = listOptions;
        this.mutatingWebhookConfiguration = mutatingWebhookConfiguration;
        this.mutatingWebhookConfigurationList = mutatingWebhookConfigurationList;
        this.objectMeta = objectMeta;
        this.patch = patch;
        this.patchOptions = patchOptions;
        this.quantity = quantity;
        this.rootPaths = rootPaths;
        this.rule = rule;
        this.ruleWithOperations = ruleWithOperations;
        this.selfSubjectAccessReview = selfSubjectAccessReview;
        this.selfSubjectReview = selfSubjectReview;
        this.selfSubjectRulesReview = selfSubjectRulesReview;
        this.serviceReference = serviceReference;
        this.status = status;
        this.time = time;
        this.tokenRequest = tokenRequest;
        this.tokenReview = tokenReview;
        this.typeMeta = typeMeta;
        this.updateOptions = updateOptions;
        this.v1AdmissionRequest = v1AdmissionRequest;
        this.v1AdmissionResponse = v1AdmissionResponse;
        this.v1AdmissionReview = v1AdmissionReview;
        this.v1Beta1AdmissionRequest = v1Beta1AdmissionRequest;
        this.v1Beta1AdmissionResponse = v1Beta1AdmissionResponse;
        this.v1Beta1AdmissionReview = v1Beta1AdmissionReview;
        this.v1Beta1Operation = v1Beta1Operation;
        this.v1Beta1PatchType = v1Beta1PatchType;
        this.v1Beta1SelfSubjectReview = v1Beta1SelfSubjectReview;
        this.v1Beta1ValidatingAdmissionPolicy = v1Beta1ValidatingAdmissionPolicy;
        this.v1Beta1ValidatingAdmissionPolicyBinding = v1Beta1ValidatingAdmissionPolicyBinding;
        this.v1Beta1ValidatingAdmissionPolicyBindingList = v1Beta1ValidatingAdmissionPolicyBindingList;
        this.v1Beta1ValidatingAdmissionPolicyList = v1Beta1ValidatingAdmissionPolicyList;
        this.v1MutatingWebhookConfiguration = v1MutatingWebhookConfiguration;
        this.v1MutatingWebhookConfigurationList = v1MutatingWebhookConfigurationList;
        this.v1Operation = v1Operation;
        this.v1PatchType = v1PatchType;
        this.v1Rule = v1Rule;
        this.v1RuleWithOperations = v1RuleWithOperations;
        this.v1SelfSubjectReview = v1SelfSubjectReview;
        this.v1ServiceReference = v1ServiceReference;
        this.v1ValidatingAdmissionPolicy = v1ValidatingAdmissionPolicy;
        this.v1ValidatingAdmissionPolicyBinding = v1ValidatingAdmissionPolicyBinding;
        this.v1ValidatingAdmissionPolicyBindingList = v1ValidatingAdmissionPolicyBindingList;
        this.v1ValidatingAdmissionPolicyList = v1ValidatingAdmissionPolicyList;
        this.v1ValidatingWebhookConfiguration = v1ValidatingWebhookConfiguration;
        this.v1ValidatingWebhookConfigurationList = v1ValidatingWebhookConfigurationList;
        this.v1beta1K8sLocalSubjectAccessReview = v1beta1K8sLocalSubjectAccessReview;
        this.v1beta1K8sSubjectAccessReview = v1beta1K8sSubjectAccessReview;
        this.v1beta1SelfSubjectAccessReview = v1beta1SelfSubjectAccessReview;
        this.v1beta1SelfSubjectRulesReview = v1beta1SelfSubjectRulesReview;
        this.validatingAdmissionPolicies = validatingAdmissionPolicies;
        this.validatingAdmissionPoliciesList = validatingAdmissionPoliciesList;
        this.validatingAdmissionPolicyBinding = validatingAdmissionPolicyBinding;
        this.validatingAdmissionPolicyBindingList = validatingAdmissionPolicyBindingList;
        this.validatingWebhookConfiguration = validatingWebhookConfiguration;
        this.validatingWebhookConfigurationList = validatingWebhookConfigurationList;
    }

    @JsonProperty("APIGroup")
    public APIGroup getAPIGroup() {
        return aPIGroup;
    }

    @JsonProperty("APIGroup")
    public void setAPIGroup(APIGroup aPIGroup) {
        this.aPIGroup = aPIGroup;
    }

    @JsonProperty("APIGroupList")
    public APIGroupList getAPIGroupList() {
        return aPIGroupList;
    }

    @JsonProperty("APIGroupList")
    public void setAPIGroupList(APIGroupList aPIGroupList) {
        this.aPIGroupList = aPIGroupList;
    }

    @JsonProperty("BaseKubernetesList")
    public KubernetesList getBaseKubernetesList() {
        return baseKubernetesList;
    }

    @JsonProperty("BaseKubernetesList")
    public void setBaseKubernetesList(KubernetesList baseKubernetesList) {
        this.baseKubernetesList = baseKubernetesList;
    }

    @JsonProperty("CreateOptions")
    public CreateOptions getCreateOptions() {
        return createOptions;
    }

    @JsonProperty("CreateOptions")
    public void setCreateOptions(CreateOptions createOptions) {
        this.createOptions = createOptions;
    }

    @JsonProperty("DeleteOptions")
    public DeleteOptions getDeleteOptions() {
        return deleteOptions;
    }

    @JsonProperty("DeleteOptions")
    public void setDeleteOptions(DeleteOptions deleteOptions) {
        this.deleteOptions = deleteOptions;
    }

    @JsonProperty("GetOptions")
    public GetOptions getGetOptions() {
        return getOptions;
    }

    @JsonProperty("GetOptions")
    public void setGetOptions(GetOptions getOptions) {
        this.getOptions = getOptions;
    }

    @JsonProperty("Info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("Info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("K8sLocalSubjectAccessReview")
    public io.fabric8.kubernetes.api.model.authorization.v1.LocalSubjectAccessReview getK8sLocalSubjectAccessReview() {
        return k8sLocalSubjectAccessReview;
    }

    @JsonProperty("K8sLocalSubjectAccessReview")
    public void setK8sLocalSubjectAccessReview(io.fabric8.kubernetes.api.model.authorization.v1.LocalSubjectAccessReview k8sLocalSubjectAccessReview) {
        this.k8sLocalSubjectAccessReview = k8sLocalSubjectAccessReview;
    }

    @JsonProperty("K8sSubjectAccessReview")
    public io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReview getK8sSubjectAccessReview() {
        return k8sSubjectAccessReview;
    }

    @JsonProperty("K8sSubjectAccessReview")
    public void setK8sSubjectAccessReview(io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReview k8sSubjectAccessReview) {
        this.k8sSubjectAccessReview = k8sSubjectAccessReview;
    }

    @JsonProperty("ListOptions")
    public ListOptions getListOptions() {
        return listOptions;
    }

    @JsonProperty("ListOptions")
    public void setListOptions(ListOptions listOptions) {
        this.listOptions = listOptions;
    }

    @JsonProperty("MutatingWebhookConfiguration")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhookConfiguration getMutatingWebhookConfiguration() {
        return mutatingWebhookConfiguration;
    }

    @JsonProperty("MutatingWebhookConfiguration")
    public void setMutatingWebhookConfiguration(io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhookConfiguration mutatingWebhookConfiguration) {
        this.mutatingWebhookConfiguration = mutatingWebhookConfiguration;
    }

    @JsonProperty("MutatingWebhookConfigurationList")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhookConfigurationList getMutatingWebhookConfigurationList() {
        return mutatingWebhookConfigurationList;
    }

    @JsonProperty("MutatingWebhookConfigurationList")
    public void setMutatingWebhookConfigurationList(io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhookConfigurationList mutatingWebhookConfigurationList) {
        this.mutatingWebhookConfigurationList = mutatingWebhookConfigurationList;
    }

    @JsonProperty("ObjectMeta")
    public ObjectMeta getObjectMeta() {
        return objectMeta;
    }

    @JsonProperty("ObjectMeta")
    public void setObjectMeta(ObjectMeta objectMeta) {
        this.objectMeta = objectMeta;
    }

    @JsonProperty("Patch")
    public Patch getPatch() {
        return patch;
    }

    @JsonProperty("Patch")
    public void setPatch(Patch patch) {
        this.patch = patch;
    }

    @JsonProperty("PatchOptions")
    public PatchOptions getPatchOptions() {
        return patchOptions;
    }

    @JsonProperty("PatchOptions")
    public void setPatchOptions(PatchOptions patchOptions) {
        this.patchOptions = patchOptions;
    }

    @JsonProperty("Quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("RootPaths")
    public RootPaths getRootPaths() {
        return rootPaths;
    }

    @JsonProperty("RootPaths")
    public void setRootPaths(RootPaths rootPaths) {
        this.rootPaths = rootPaths;
    }

    @JsonProperty("Rule")
    public Rule getRule() {
        return rule;
    }

    @JsonProperty("Rule")
    public void setRule(Rule rule) {
        this.rule = rule;
    }

    @JsonProperty("RuleWithOperations")
    public RuleWithOperations getRuleWithOperations() {
        return ruleWithOperations;
    }

    @JsonProperty("RuleWithOperations")
    public void setRuleWithOperations(RuleWithOperations ruleWithOperations) {
        this.ruleWithOperations = ruleWithOperations;
    }

    @JsonProperty("SelfSubjectAccessReview")
    public io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectAccessReview getSelfSubjectAccessReview() {
        return selfSubjectAccessReview;
    }

    @JsonProperty("SelfSubjectAccessReview")
    public void setSelfSubjectAccessReview(io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectAccessReview selfSubjectAccessReview) {
        this.selfSubjectAccessReview = selfSubjectAccessReview;
    }

    @JsonProperty("SelfSubjectReview")
    public io.fabric8.kubernetes.api.model.authentication.v1alpha1.SelfSubjectReview getSelfSubjectReview() {
        return selfSubjectReview;
    }

    @JsonProperty("SelfSubjectReview")
    public void setSelfSubjectReview(io.fabric8.kubernetes.api.model.authentication.v1alpha1.SelfSubjectReview selfSubjectReview) {
        this.selfSubjectReview = selfSubjectReview;
    }

    @JsonProperty("SelfSubjectRulesReview")
    public io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectRulesReview getSelfSubjectRulesReview() {
        return selfSubjectRulesReview;
    }

    @JsonProperty("SelfSubjectRulesReview")
    public void setSelfSubjectRulesReview(io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectRulesReview selfSubjectRulesReview) {
        this.selfSubjectRulesReview = selfSubjectRulesReview;
    }

    @JsonProperty("ServiceReference")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ServiceReference getServiceReference() {
        return serviceReference;
    }

    @JsonProperty("ServiceReference")
    public void setServiceReference(io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ServiceReference serviceReference) {
        this.serviceReference = serviceReference;
    }

    @JsonProperty("Status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("Time")
    public String getTime() {
        return time;
    }

    @JsonProperty("Time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("TokenRequest")
    public TokenRequest getTokenRequest() {
        return tokenRequest;
    }

    @JsonProperty("TokenRequest")
    public void setTokenRequest(TokenRequest tokenRequest) {
        this.tokenRequest = tokenRequest;
    }

    @JsonProperty("TokenReview")
    public TokenReview getTokenReview() {
        return tokenReview;
    }

    @JsonProperty("TokenReview")
    public void setTokenReview(TokenReview tokenReview) {
        this.tokenReview = tokenReview;
    }

    @JsonProperty("TypeMeta")
    public TypeMeta getTypeMeta() {
        return typeMeta;
    }

    @JsonProperty("TypeMeta")
    public void setTypeMeta(TypeMeta typeMeta) {
        this.typeMeta = typeMeta;
    }

    @JsonProperty("UpdateOptions")
    public UpdateOptions getUpdateOptions() {
        return updateOptions;
    }

    @JsonProperty("UpdateOptions")
    public void setUpdateOptions(UpdateOptions updateOptions) {
        this.updateOptions = updateOptions;
    }

    @JsonProperty("V1AdmissionRequest")
    public io.fabric8.kubernetes.api.model.admission.v1.AdmissionRequest getV1AdmissionRequest() {
        return v1AdmissionRequest;
    }

    @JsonProperty("V1AdmissionRequest")
    public void setV1AdmissionRequest(io.fabric8.kubernetes.api.model.admission.v1.AdmissionRequest v1AdmissionRequest) {
        this.v1AdmissionRequest = v1AdmissionRequest;
    }

    @JsonProperty("V1AdmissionResponse")
    public io.fabric8.kubernetes.api.model.admission.v1.AdmissionResponse getV1AdmissionResponse() {
        return v1AdmissionResponse;
    }

    @JsonProperty("V1AdmissionResponse")
    public void setV1AdmissionResponse(io.fabric8.kubernetes.api.model.admission.v1.AdmissionResponse v1AdmissionResponse) {
        this.v1AdmissionResponse = v1AdmissionResponse;
    }

    @JsonProperty("V1AdmissionReview")
    public io.fabric8.kubernetes.api.model.admission.v1.AdmissionReview getV1AdmissionReview() {
        return v1AdmissionReview;
    }

    @JsonProperty("V1AdmissionReview")
    public void setV1AdmissionReview(io.fabric8.kubernetes.api.model.admission.v1.AdmissionReview v1AdmissionReview) {
        this.v1AdmissionReview = v1AdmissionReview;
    }

    @JsonProperty("V1Beta1AdmissionRequest")
    public io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionRequest getV1Beta1AdmissionRequest() {
        return v1Beta1AdmissionRequest;
    }

    @JsonProperty("V1Beta1AdmissionRequest")
    public void setV1Beta1AdmissionRequest(io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionRequest v1Beta1AdmissionRequest) {
        this.v1Beta1AdmissionRequest = v1Beta1AdmissionRequest;
    }

    @JsonProperty("V1Beta1AdmissionResponse")
    public io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionResponse getV1Beta1AdmissionResponse() {
        return v1Beta1AdmissionResponse;
    }

    @JsonProperty("V1Beta1AdmissionResponse")
    public void setV1Beta1AdmissionResponse(io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionResponse v1Beta1AdmissionResponse) {
        this.v1Beta1AdmissionResponse = v1Beta1AdmissionResponse;
    }

    @JsonProperty("V1Beta1AdmissionReview")
    public io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionReview getV1Beta1AdmissionReview() {
        return v1Beta1AdmissionReview;
    }

    @JsonProperty("V1Beta1AdmissionReview")
    public void setV1Beta1AdmissionReview(io.fabric8.kubernetes.api.model.admission.v1beta1.AdmissionReview v1Beta1AdmissionReview) {
        this.v1Beta1AdmissionReview = v1Beta1AdmissionReview;
    }

    @JsonProperty("V1Beta1Operation")
    public String getV1Beta1Operation() {
        return v1Beta1Operation;
    }

    @JsonProperty("V1Beta1Operation")
    public void setV1Beta1Operation(String v1Beta1Operation) {
        this.v1Beta1Operation = v1Beta1Operation;
    }

    @JsonProperty("V1Beta1PatchType")
    public String getV1Beta1PatchType() {
        return v1Beta1PatchType;
    }

    @JsonProperty("V1Beta1PatchType")
    public void setV1Beta1PatchType(String v1Beta1PatchType) {
        this.v1Beta1PatchType = v1Beta1PatchType;
    }

    @JsonProperty("V1Beta1SelfSubjectReview")
    public io.fabric8.kubernetes.api.model.authentication.v1beta1.SelfSubjectReview getV1Beta1SelfSubjectReview() {
        return v1Beta1SelfSubjectReview;
    }

    @JsonProperty("V1Beta1SelfSubjectReview")
    public void setV1Beta1SelfSubjectReview(io.fabric8.kubernetes.api.model.authentication.v1beta1.SelfSubjectReview v1Beta1SelfSubjectReview) {
        this.v1Beta1SelfSubjectReview = v1Beta1SelfSubjectReview;
    }

    @JsonProperty("V1Beta1ValidatingAdmissionPolicy")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicy getV1Beta1ValidatingAdmissionPolicy() {
        return v1Beta1ValidatingAdmissionPolicy;
    }

    @JsonProperty("V1Beta1ValidatingAdmissionPolicy")
    public void setV1Beta1ValidatingAdmissionPolicy(io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicy v1Beta1ValidatingAdmissionPolicy) {
        this.v1Beta1ValidatingAdmissionPolicy = v1Beta1ValidatingAdmissionPolicy;
    }

    @JsonProperty("V1Beta1ValidatingAdmissionPolicyBinding")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBinding getV1Beta1ValidatingAdmissionPolicyBinding() {
        return v1Beta1ValidatingAdmissionPolicyBinding;
    }

    @JsonProperty("V1Beta1ValidatingAdmissionPolicyBinding")
    public void setV1Beta1ValidatingAdmissionPolicyBinding(io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBinding v1Beta1ValidatingAdmissionPolicyBinding) {
        this.v1Beta1ValidatingAdmissionPolicyBinding = v1Beta1ValidatingAdmissionPolicyBinding;
    }

    @JsonProperty("V1Beta1ValidatingAdmissionPolicyBindingList")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBindingList getV1Beta1ValidatingAdmissionPolicyBindingList() {
        return v1Beta1ValidatingAdmissionPolicyBindingList;
    }

    @JsonProperty("V1Beta1ValidatingAdmissionPolicyBindingList")
    public void setV1Beta1ValidatingAdmissionPolicyBindingList(io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBindingList v1Beta1ValidatingAdmissionPolicyBindingList) {
        this.v1Beta1ValidatingAdmissionPolicyBindingList = v1Beta1ValidatingAdmissionPolicyBindingList;
    }

    @JsonProperty("V1Beta1ValidatingAdmissionPolicyList")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyList getV1Beta1ValidatingAdmissionPolicyList() {
        return v1Beta1ValidatingAdmissionPolicyList;
    }

    @JsonProperty("V1Beta1ValidatingAdmissionPolicyList")
    public void setV1Beta1ValidatingAdmissionPolicyList(io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyList v1Beta1ValidatingAdmissionPolicyList) {
        this.v1Beta1ValidatingAdmissionPolicyList = v1Beta1ValidatingAdmissionPolicyList;
    }

    @JsonProperty("V1MutatingWebhookConfiguration")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfiguration getV1MutatingWebhookConfiguration() {
        return v1MutatingWebhookConfiguration;
    }

    @JsonProperty("V1MutatingWebhookConfiguration")
    public void setV1MutatingWebhookConfiguration(io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfiguration v1MutatingWebhookConfiguration) {
        this.v1MutatingWebhookConfiguration = v1MutatingWebhookConfiguration;
    }

    @JsonProperty("V1MutatingWebhookConfigurationList")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfigurationList getV1MutatingWebhookConfigurationList() {
        return v1MutatingWebhookConfigurationList;
    }

    @JsonProperty("V1MutatingWebhookConfigurationList")
    public void setV1MutatingWebhookConfigurationList(io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfigurationList v1MutatingWebhookConfigurationList) {
        this.v1MutatingWebhookConfigurationList = v1MutatingWebhookConfigurationList;
    }

    @JsonProperty("V1Operation")
    public String getV1Operation() {
        return v1Operation;
    }

    @JsonProperty("V1Operation")
    public void setV1Operation(String v1Operation) {
        this.v1Operation = v1Operation;
    }

    @JsonProperty("V1PatchType")
    public String getV1PatchType() {
        return v1PatchType;
    }

    @JsonProperty("V1PatchType")
    public void setV1PatchType(String v1PatchType) {
        this.v1PatchType = v1PatchType;
    }

    @JsonProperty("V1Rule")
    public Rule getV1Rule() {
        return v1Rule;
    }

    @JsonProperty("V1Rule")
    public void setV1Rule(Rule v1Rule) {
        this.v1Rule = v1Rule;
    }

    @JsonProperty("V1RuleWithOperations")
    public RuleWithOperations getV1RuleWithOperations() {
        return v1RuleWithOperations;
    }

    @JsonProperty("V1RuleWithOperations")
    public void setV1RuleWithOperations(RuleWithOperations v1RuleWithOperations) {
        this.v1RuleWithOperations = v1RuleWithOperations;
    }

    @JsonProperty("V1SelfSubjectReview")
    public io.fabric8.kubernetes.api.model.authentication.SelfSubjectReview getV1SelfSubjectReview() {
        return v1SelfSubjectReview;
    }

    @JsonProperty("V1SelfSubjectReview")
    public void setV1SelfSubjectReview(io.fabric8.kubernetes.api.model.authentication.SelfSubjectReview v1SelfSubjectReview) {
        this.v1SelfSubjectReview = v1SelfSubjectReview;
    }

    @JsonProperty("V1ServiceReference")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1.ServiceReference getV1ServiceReference() {
        return v1ServiceReference;
    }

    @JsonProperty("V1ServiceReference")
    public void setV1ServiceReference(io.fabric8.kubernetes.api.model.admissionregistration.v1.ServiceReference v1ServiceReference) {
        this.v1ServiceReference = v1ServiceReference;
    }

    @JsonProperty("V1ValidatingAdmissionPolicy")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicy getV1ValidatingAdmissionPolicy() {
        return v1ValidatingAdmissionPolicy;
    }

    @JsonProperty("V1ValidatingAdmissionPolicy")
    public void setV1ValidatingAdmissionPolicy(io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicy v1ValidatingAdmissionPolicy) {
        this.v1ValidatingAdmissionPolicy = v1ValidatingAdmissionPolicy;
    }

    @JsonProperty("V1ValidatingAdmissionPolicyBinding")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBinding getV1ValidatingAdmissionPolicyBinding() {
        return v1ValidatingAdmissionPolicyBinding;
    }

    @JsonProperty("V1ValidatingAdmissionPolicyBinding")
    public void setV1ValidatingAdmissionPolicyBinding(io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBinding v1ValidatingAdmissionPolicyBinding) {
        this.v1ValidatingAdmissionPolicyBinding = v1ValidatingAdmissionPolicyBinding;
    }

    @JsonProperty("V1ValidatingAdmissionPolicyBindingList")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBindingList getV1ValidatingAdmissionPolicyBindingList() {
        return v1ValidatingAdmissionPolicyBindingList;
    }

    @JsonProperty("V1ValidatingAdmissionPolicyBindingList")
    public void setV1ValidatingAdmissionPolicyBindingList(io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBindingList v1ValidatingAdmissionPolicyBindingList) {
        this.v1ValidatingAdmissionPolicyBindingList = v1ValidatingAdmissionPolicyBindingList;
    }

    @JsonProperty("V1ValidatingAdmissionPolicyList")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyList getV1ValidatingAdmissionPolicyList() {
        return v1ValidatingAdmissionPolicyList;
    }

    @JsonProperty("V1ValidatingAdmissionPolicyList")
    public void setV1ValidatingAdmissionPolicyList(io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyList v1ValidatingAdmissionPolicyList) {
        this.v1ValidatingAdmissionPolicyList = v1ValidatingAdmissionPolicyList;
    }

    @JsonProperty("V1ValidatingWebhookConfiguration")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhookConfiguration getV1ValidatingWebhookConfiguration() {
        return v1ValidatingWebhookConfiguration;
    }

    @JsonProperty("V1ValidatingWebhookConfiguration")
    public void setV1ValidatingWebhookConfiguration(io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhookConfiguration v1ValidatingWebhookConfiguration) {
        this.v1ValidatingWebhookConfiguration = v1ValidatingWebhookConfiguration;
    }

    @JsonProperty("V1ValidatingWebhookConfigurationList")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhookConfigurationList getV1ValidatingWebhookConfigurationList() {
        return v1ValidatingWebhookConfigurationList;
    }

    @JsonProperty("V1ValidatingWebhookConfigurationList")
    public void setV1ValidatingWebhookConfigurationList(io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhookConfigurationList v1ValidatingWebhookConfigurationList) {
        this.v1ValidatingWebhookConfigurationList = v1ValidatingWebhookConfigurationList;
    }

    @JsonProperty("V1beta1K8sLocalSubjectAccessReview")
    public io.fabric8.kubernetes.api.model.authorization.v1beta1.LocalSubjectAccessReview getV1beta1K8sLocalSubjectAccessReview() {
        return v1beta1K8sLocalSubjectAccessReview;
    }

    @JsonProperty("V1beta1K8sLocalSubjectAccessReview")
    public void setV1beta1K8sLocalSubjectAccessReview(io.fabric8.kubernetes.api.model.authorization.v1beta1.LocalSubjectAccessReview v1beta1K8sLocalSubjectAccessReview) {
        this.v1beta1K8sLocalSubjectAccessReview = v1beta1K8sLocalSubjectAccessReview;
    }

    @JsonProperty("V1beta1K8sSubjectAccessReview")
    public io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectAccessReview getV1beta1K8sSubjectAccessReview() {
        return v1beta1K8sSubjectAccessReview;
    }

    @JsonProperty("V1beta1K8sSubjectAccessReview")
    public void setV1beta1K8sSubjectAccessReview(io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectAccessReview v1beta1K8sSubjectAccessReview) {
        this.v1beta1K8sSubjectAccessReview = v1beta1K8sSubjectAccessReview;
    }

    @JsonProperty("V1beta1SelfSubjectAccessReview")
    public io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectAccessReview getV1beta1SelfSubjectAccessReview() {
        return v1beta1SelfSubjectAccessReview;
    }

    @JsonProperty("V1beta1SelfSubjectAccessReview")
    public void setV1beta1SelfSubjectAccessReview(io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectAccessReview v1beta1SelfSubjectAccessReview) {
        this.v1beta1SelfSubjectAccessReview = v1beta1SelfSubjectAccessReview;
    }

    @JsonProperty("V1beta1SelfSubjectRulesReview")
    public io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectRulesReview getV1beta1SelfSubjectRulesReview() {
        return v1beta1SelfSubjectRulesReview;
    }

    @JsonProperty("V1beta1SelfSubjectRulesReview")
    public void setV1beta1SelfSubjectRulesReview(io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectRulesReview v1beta1SelfSubjectRulesReview) {
        this.v1beta1SelfSubjectRulesReview = v1beta1SelfSubjectRulesReview;
    }

    @JsonProperty("ValidatingAdmissionPolicies")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicy getValidatingAdmissionPolicies() {
        return validatingAdmissionPolicies;
    }

    @JsonProperty("ValidatingAdmissionPolicies")
    public void setValidatingAdmissionPolicies(io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicy validatingAdmissionPolicies) {
        this.validatingAdmissionPolicies = validatingAdmissionPolicies;
    }

    @JsonProperty("ValidatingAdmissionPoliciesList")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyList getValidatingAdmissionPoliciesList() {
        return validatingAdmissionPoliciesList;
    }

    @JsonProperty("ValidatingAdmissionPoliciesList")
    public void setValidatingAdmissionPoliciesList(io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyList validatingAdmissionPoliciesList) {
        this.validatingAdmissionPoliciesList = validatingAdmissionPoliciesList;
    }

    @JsonProperty("ValidatingAdmissionPolicyBinding")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBinding getValidatingAdmissionPolicyBinding() {
        return validatingAdmissionPolicyBinding;
    }

    @JsonProperty("ValidatingAdmissionPolicyBinding")
    public void setValidatingAdmissionPolicyBinding(io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBinding validatingAdmissionPolicyBinding) {
        this.validatingAdmissionPolicyBinding = validatingAdmissionPolicyBinding;
    }

    @JsonProperty("ValidatingAdmissionPolicyBindingList")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBindingList getValidatingAdmissionPolicyBindingList() {
        return validatingAdmissionPolicyBindingList;
    }

    @JsonProperty("ValidatingAdmissionPolicyBindingList")
    public void setValidatingAdmissionPolicyBindingList(io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBindingList validatingAdmissionPolicyBindingList) {
        this.validatingAdmissionPolicyBindingList = validatingAdmissionPolicyBindingList;
    }

    @JsonProperty("ValidatingWebhookConfiguration")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhookConfiguration getValidatingWebhookConfiguration() {
        return validatingWebhookConfiguration;
    }

    @JsonProperty("ValidatingWebhookConfiguration")
    public void setValidatingWebhookConfiguration(io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhookConfiguration validatingWebhookConfiguration) {
        this.validatingWebhookConfiguration = validatingWebhookConfiguration;
    }

    @JsonProperty("ValidatingWebhookConfigurationList")
    public io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhookConfigurationList getValidatingWebhookConfigurationList() {
        return validatingWebhookConfigurationList;
    }

    @JsonProperty("ValidatingWebhookConfigurationList")
    public void setValidatingWebhookConfigurationList(io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhookConfigurationList validatingWebhookConfigurationList) {
        this.validatingWebhookConfigurationList = validatingWebhookConfigurationList;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
