@isTest
private class OASLeadFormCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadFormCreateRequest leadFormCreateRequest1 = OASLeadFormCreateRequest.getExample();
        OASLeadFormCreateRequest leadFormCreateRequest2 = leadFormCreateRequest1;
        OASLeadFormCreateRequest leadFormCreateRequest3 = new OASLeadFormCreateRequest();
        OASLeadFormCreateRequest leadFormCreateRequest4 = leadFormCreateRequest3;

        System.assert(leadFormCreateRequest1.equals(leadFormCreateRequest2));
        System.assert(leadFormCreateRequest2.equals(leadFormCreateRequest1));
        System.assert(leadFormCreateRequest1.equals(leadFormCreateRequest1));
        System.assert(leadFormCreateRequest3.equals(leadFormCreateRequest4));
        System.assert(leadFormCreateRequest4.equals(leadFormCreateRequest3));
        System.assert(leadFormCreateRequest3.equals(leadFormCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadFormCreateRequest leadFormCreateRequest1 = OASLeadFormCreateRequest.getExample();
        OASLeadFormCreateRequest leadFormCreateRequest2 = OASLeadFormCreateRequest.getExample();
        OASLeadFormCreateRequest leadFormCreateRequest3 = new OASLeadFormCreateRequest();
        OASLeadFormCreateRequest leadFormCreateRequest4 = new OASLeadFormCreateRequest();

        System.assert(leadFormCreateRequest1.equals(leadFormCreateRequest2));
        System.assert(leadFormCreateRequest2.equals(leadFormCreateRequest1));
        System.assert(leadFormCreateRequest3.equals(leadFormCreateRequest4));
        System.assert(leadFormCreateRequest4.equals(leadFormCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadFormCreateRequest leadFormCreateRequest1 = OASLeadFormCreateRequest.getExample();
        OASLeadFormCreateRequest leadFormCreateRequest2 = new OASLeadFormCreateRequest();

        System.assertEquals(false, leadFormCreateRequest1.equals('foo'));
        System.assertEquals(false, leadFormCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadFormCreateRequest leadFormCreateRequest1 = OASLeadFormCreateRequest.getExample();
        OASLeadFormCreateRequest leadFormCreateRequest2 = new OASLeadFormCreateRequest();
        OASLeadFormCreateRequest leadFormCreateRequest3;

        System.assertEquals(false, leadFormCreateRequest1.equals(leadFormCreateRequest3));
        System.assertEquals(false, leadFormCreateRequest2.equals(leadFormCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadFormCreateRequest leadFormCreateRequest1 = OASLeadFormCreateRequest.getExample();
        OASLeadFormCreateRequest leadFormCreateRequest2 = new OASLeadFormCreateRequest();

        System.assertEquals(leadFormCreateRequest1.hashCode(), leadFormCreateRequest1.hashCode());
        System.assertEquals(leadFormCreateRequest2.hashCode(), leadFormCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadFormCreateRequest leadFormCreateRequest1 = OASLeadFormCreateRequest.getExample();
        OASLeadFormCreateRequest leadFormCreateRequest2 = OASLeadFormCreateRequest.getExample();
        OASLeadFormCreateRequest leadFormCreateRequest3 = new OASLeadFormCreateRequest();
        OASLeadFormCreateRequest leadFormCreateRequest4 = new OASLeadFormCreateRequest();

        System.assert(leadFormCreateRequest1.equals(leadFormCreateRequest2));
        System.assert(leadFormCreateRequest3.equals(leadFormCreateRequest4));
        System.assertEquals(leadFormCreateRequest1.hashCode(), leadFormCreateRequest2.hashCode());
        System.assertEquals(leadFormCreateRequest3.hashCode(), leadFormCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLeadFormCreateRequest leadFormCreateRequest = new OASLeadFormCreateRequest();
        Map<String, String> x-property-mappings = leadFormCreateRequest.getx-property-mappings();
        System.assertEquals('privacyPolicyLink', x-property-mappings.get('privacy_policy_link'));
        System.assertEquals('hasAcceptedTerms', x-property-mappings.get('has_accepted_terms'));
        System.assertEquals('completionMessage', x-property-mappings.get('completion_message'));
        System.assertEquals('disclosureLanguage', x-property-mappings.get('disclosure_language'));
        System.assertEquals('policyLinks', x-property-mappings.get('policy_links'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLeadFormCreateRequest leadFormCreateRequest = new OASLeadFormCreateRequest();
        System.assertEquals(new List<OASLeadFormQuestion>(), leadFormCreateRequest.questions);
        System.assertEquals(new List<OASLeadFormCommonPolicyLinksInner>(), leadFormCreateRequest.policyLinks);
        System.assertEquals(null, leadFormCreateRequest.name);
        System.assertEquals(null, leadFormCreateRequest.privacyPolicyLink);
        System.assertEquals(null, leadFormCreateRequest.hasAcceptedTerms);
        System.assertEquals(null, leadFormCreateRequest.completionMessage);
        System.assertEquals(null, leadFormCreateRequest.status);
        System.assertEquals(null, leadFormCreateRequest.disclosureLanguage);
    }
}
