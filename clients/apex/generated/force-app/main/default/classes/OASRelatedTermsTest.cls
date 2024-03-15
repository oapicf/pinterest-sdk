@isTest
private class OASRelatedTermsTest {
    @isTest
    private static void equalsSameInstance() {
        OASRelatedTerms relatedTerms1 = OASRelatedTerms.getExample();
        OASRelatedTerms relatedTerms2 = relatedTerms1;
        OASRelatedTerms relatedTerms3 = new OASRelatedTerms();
        OASRelatedTerms relatedTerms4 = relatedTerms3;

        System.assert(relatedTerms1.equals(relatedTerms2));
        System.assert(relatedTerms2.equals(relatedTerms1));
        System.assert(relatedTerms1.equals(relatedTerms1));
        System.assert(relatedTerms3.equals(relatedTerms4));
        System.assert(relatedTerms4.equals(relatedTerms3));
        System.assert(relatedTerms3.equals(relatedTerms3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRelatedTerms relatedTerms1 = OASRelatedTerms.getExample();
        OASRelatedTerms relatedTerms2 = OASRelatedTerms.getExample();
        OASRelatedTerms relatedTerms3 = new OASRelatedTerms();
        OASRelatedTerms relatedTerms4 = new OASRelatedTerms();

        System.assert(relatedTerms1.equals(relatedTerms2));
        System.assert(relatedTerms2.equals(relatedTerms1));
        System.assert(relatedTerms3.equals(relatedTerms4));
        System.assert(relatedTerms4.equals(relatedTerms3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRelatedTerms relatedTerms1 = OASRelatedTerms.getExample();
        OASRelatedTerms relatedTerms2 = new OASRelatedTerms();

        System.assertEquals(false, relatedTerms1.equals('foo'));
        System.assertEquals(false, relatedTerms2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRelatedTerms relatedTerms1 = OASRelatedTerms.getExample();
        OASRelatedTerms relatedTerms2 = new OASRelatedTerms();
        OASRelatedTerms relatedTerms3;

        System.assertEquals(false, relatedTerms1.equals(relatedTerms3));
        System.assertEquals(false, relatedTerms2.equals(relatedTerms3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRelatedTerms relatedTerms1 = OASRelatedTerms.getExample();
        OASRelatedTerms relatedTerms2 = new OASRelatedTerms();

        System.assertEquals(relatedTerms1.hashCode(), relatedTerms1.hashCode());
        System.assertEquals(relatedTerms2.hashCode(), relatedTerms2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRelatedTerms relatedTerms1 = OASRelatedTerms.getExample();
        OASRelatedTerms relatedTerms2 = OASRelatedTerms.getExample();
        OASRelatedTerms relatedTerms3 = new OASRelatedTerms();
        OASRelatedTerms relatedTerms4 = new OASRelatedTerms();

        System.assert(relatedTerms1.equals(relatedTerms2));
        System.assert(relatedTerms3.equals(relatedTerms4));
        System.assertEquals(relatedTerms1.hashCode(), relatedTerms2.hashCode());
        System.assertEquals(relatedTerms3.hashCode(), relatedTerms4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRelatedTerms relatedTerms = new OASRelatedTerms();
        Map<String, String> x-property-mappings = relatedTerms.getx-property-mappings();
        System.assertEquals('relatedTermCount', x-property-mappings.get('related_term_count'));
        System.assertEquals('relatedTermsList', x-property-mappings.get('related_terms_list'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRelatedTerms relatedTerms = new OASRelatedTerms();
        System.assertEquals(new List<OASRelatedTermsRelatedTermsListInner>(), relatedTerms.relatedTermsList);
        System.assertEquals(null, relatedTerms.id);
        System.assertEquals(null, relatedTerms.relatedTermCount);
    }
}
