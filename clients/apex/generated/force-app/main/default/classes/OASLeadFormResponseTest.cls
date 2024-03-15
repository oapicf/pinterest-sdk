@isTest
private class OASLeadFormResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadFormResponse leadFormResponse1 = OASLeadFormResponse.getExample();
        OASLeadFormResponse leadFormResponse2 = leadFormResponse1;
        OASLeadFormResponse leadFormResponse3 = new OASLeadFormResponse();
        OASLeadFormResponse leadFormResponse4 = leadFormResponse3;

        System.assert(leadFormResponse1.equals(leadFormResponse2));
        System.assert(leadFormResponse2.equals(leadFormResponse1));
        System.assert(leadFormResponse1.equals(leadFormResponse1));
        System.assert(leadFormResponse3.equals(leadFormResponse4));
        System.assert(leadFormResponse4.equals(leadFormResponse3));
        System.assert(leadFormResponse3.equals(leadFormResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadFormResponse leadFormResponse1 = OASLeadFormResponse.getExample();
        OASLeadFormResponse leadFormResponse2 = OASLeadFormResponse.getExample();
        OASLeadFormResponse leadFormResponse3 = new OASLeadFormResponse();
        OASLeadFormResponse leadFormResponse4 = new OASLeadFormResponse();

        System.assert(leadFormResponse1.equals(leadFormResponse2));
        System.assert(leadFormResponse2.equals(leadFormResponse1));
        System.assert(leadFormResponse3.equals(leadFormResponse4));
        System.assert(leadFormResponse4.equals(leadFormResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadFormResponse leadFormResponse1 = OASLeadFormResponse.getExample();
        OASLeadFormResponse leadFormResponse2 = new OASLeadFormResponse();

        System.assertEquals(false, leadFormResponse1.equals('foo'));
        System.assertEquals(false, leadFormResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadFormResponse leadFormResponse1 = OASLeadFormResponse.getExample();
        OASLeadFormResponse leadFormResponse2 = new OASLeadFormResponse();
        OASLeadFormResponse leadFormResponse3;

        System.assertEquals(false, leadFormResponse1.equals(leadFormResponse3));
        System.assertEquals(false, leadFormResponse2.equals(leadFormResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadFormResponse leadFormResponse1 = OASLeadFormResponse.getExample();
        OASLeadFormResponse leadFormResponse2 = new OASLeadFormResponse();

        System.assertEquals(leadFormResponse1.hashCode(), leadFormResponse1.hashCode());
        System.assertEquals(leadFormResponse2.hashCode(), leadFormResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadFormResponse leadFormResponse1 = OASLeadFormResponse.getExample();
        OASLeadFormResponse leadFormResponse2 = OASLeadFormResponse.getExample();
        OASLeadFormResponse leadFormResponse3 = new OASLeadFormResponse();
        OASLeadFormResponse leadFormResponse4 = new OASLeadFormResponse();

        System.assert(leadFormResponse1.equals(leadFormResponse2));
        System.assert(leadFormResponse3.equals(leadFormResponse4));
        System.assertEquals(leadFormResponse1.hashCode(), leadFormResponse2.hashCode());
        System.assertEquals(leadFormResponse3.hashCode(), leadFormResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLeadFormResponse leadFormResponse = new OASLeadFormResponse();
        Map<String, String> x-property-mappings = leadFormResponse.getx-property-mappings();
        System.assertEquals('privacyPolicyLink', x-property-mappings.get('privacy_policy_link'));
        System.assertEquals('hasAcceptedTerms', x-property-mappings.get('has_accepted_terms'));
        System.assertEquals('completionMessage', x-property-mappings.get('completion_message'));
        System.assertEquals('disclosureLanguage', x-property-mappings.get('disclosure_language'));
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLeadFormResponse leadFormResponse = new OASLeadFormResponse();
        System.assertEquals(new List<OASLeadFormQuestion>(), leadFormResponse.questions);
        System.assertEquals(null, leadFormResponse.name);
        System.assertEquals(null, leadFormResponse.privacyPolicyLink);
        System.assertEquals(null, leadFormResponse.hasAcceptedTerms);
        System.assertEquals(null, leadFormResponse.completionMessage);
        System.assertEquals(null, leadFormResponse.status);
        System.assertEquals(null, leadFormResponse.disclosureLanguage);
        System.assertEquals(null, leadFormResponse.id);
        System.assertEquals(null, leadFormResponse.adAccountId);
        System.assertEquals(null, leadFormResponse.createdTime);
        System.assertEquals(null, leadFormResponse.updatedTime);
    }
}
