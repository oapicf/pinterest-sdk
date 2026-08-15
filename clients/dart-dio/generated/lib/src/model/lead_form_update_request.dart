//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/lead_form_common_policy_links_inner.dart';
import 'package:openapi/src/model/lead_form_status.dart';
import 'package:openapi/src/model/lead_form_question.dart';
import 'package:openapi/src/model/lead_form_common.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_form_update_request.g.dart';

/// LeadFormUpdateRequest
///
/// Properties:
/// * [completionMessage] - A message for people who complete the form to let them know what happens next.
/// * [disclosureLanguage] - Additional disclosure language to be included in the lead form.
/// * [hasAcceptedTerms] - Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
/// * [name] - Internal name of the lead form.
/// * [policyLinks] - List of additional policy links to be displayed on the lead form.
/// * [privacyPolicyLink] - A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
/// * [questions] - List of questions to be displayed on the lead form.
/// * [status] 
/// * [id] - The ID of this lead form to be updated
@BuiltValue()
abstract class LeadFormUpdateRequest implements LeadFormCommon, Built<LeadFormUpdateRequest, LeadFormUpdateRequestBuilder> {
  /// The ID of this lead form to be updated
  @BuiltValueField(wireName: r'id')
  String get id;

  LeadFormUpdateRequest._();

  factory LeadFormUpdateRequest([void updates(LeadFormUpdateRequestBuilder b)]) = _$LeadFormUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadFormUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadFormUpdateRequest> get serializer => _$LeadFormUpdateRequestSerializer();
}

class _$LeadFormUpdateRequestSerializer implements PrimitiveSerializer<LeadFormUpdateRequest> {
  @override
  final Iterable<Type> types = const [LeadFormUpdateRequest, _$LeadFormUpdateRequest];

  @override
  final String wireName = r'LeadFormUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadFormUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.policyLinks != null) {
      yield r'policy_links';
      yield serializers.serialize(
        object.policyLinks,
        specifiedType: const FullType(BuiltList, [FullType(LeadFormCommonPolicyLinksInner)]),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.questions != null) {
      yield r'questions';
      yield serializers.serialize(
        object.questions,
        specifiedType: const FullType(BuiltList, [FullType(LeadFormQuestion)]),
      );
    }
    if (object.completionMessage != null) {
      yield r'completion_message';
      yield serializers.serialize(
        object.completionMessage,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.disclosureLanguage != null) {
      yield r'disclosure_language';
      yield serializers.serialize(
        object.disclosureLanguage,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.hasAcceptedTerms != null) {
      yield r'has_accepted_terms';
      yield serializers.serialize(
        object.hasAcceptedTerms,
        specifiedType: const FullType(bool),
      );
    }
    if (object.privacyPolicyLink != null) {
      yield r'privacy_policy_link';
      yield serializers.serialize(
        object.privacyPolicyLink,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(LeadFormStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadFormUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadFormUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'policy_links':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LeadFormCommonPolicyLinksInner)]),
          ) as BuiltList<LeadFormCommonPolicyLinksInner>;
          result.policyLinks.replace(valueDes);
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'questions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LeadFormQuestion)]),
          ) as BuiltList<LeadFormQuestion>;
          result.questions.replace(valueDes);
          break;
        case r'completion_message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.completionMessage = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'disclosure_language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.disclosureLanguage = valueDes;
          break;
        case r'has_accepted_terms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.hasAcceptedTerms = valueDes;
          break;
        case r'privacy_policy_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.privacyPolicyLink = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LeadFormStatus),
          ) as LeadFormStatus;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LeadFormUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadFormUpdateRequestBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

