//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/lead_form_status.dart';
import 'package:openapi/src/model/lead_form_question.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/lead_form_policy_link.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_form_batch_update.g.dart';

/// LeadFormBatchUpdate
///
/// Properties:
/// * [completionMessage] - A message for people who complete the form to let them know what happens next.
/// * [disclosureLanguage] - Additional disclosure language to be included in the lead form.
/// * [hasAcceptedTerms] - Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
/// * [id] - The ID of this lead form
/// * [name] - Internal name of the lead form.
/// * [policyLinks] - List of additional policy links to be displayed on the lead form.
/// * [privacyPolicyLink] - A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
/// * [questions] - List of questions to be displayed on the lead form.
/// * [status] 
@BuiltValue()
abstract class LeadFormBatchUpdate implements Built<LeadFormBatchUpdate, LeadFormBatchUpdateBuilder> {
  /// A message for people who complete the form to let them know what happens next.
  @BuiltValueField(wireName: r'completion_message')
  String? get completionMessage;

  /// Additional disclosure language to be included in the lead form.
  @BuiltValueField(wireName: r'disclosure_language')
  String? get disclosureLanguage;

  /// Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
  @BuiltValueField(wireName: r'has_accepted_terms')
  bool? get hasAcceptedTerms;

  /// The ID of this lead form
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Internal name of the lead form.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// List of additional policy links to be displayed on the lead form.
  @BuiltValueField(wireName: r'policy_links')
  BuiltList<LeadFormPolicyLink>? get policyLinks;

  /// A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
  @BuiltValueField(wireName: r'privacy_policy_link')
  String? get privacyPolicyLink;

  /// List of questions to be displayed on the lead form.
  @BuiltValueField(wireName: r'questions')
  BuiltList<LeadFormQuestion>? get questions;

  @BuiltValueField(wireName: r'status')
  LeadFormStatus? get status;
  // enum statusEnum {  DRAFT,  ACTIVE,  };

  LeadFormBatchUpdate._();

  factory LeadFormBatchUpdate([void updates(LeadFormBatchUpdateBuilder b)]) = _$LeadFormBatchUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadFormBatchUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadFormBatchUpdate> get serializer => _$LeadFormBatchUpdateSerializer();
}

class _$LeadFormBatchUpdateSerializer implements PrimitiveSerializer<LeadFormBatchUpdate> {
  @override
  final Iterable<Type> types = const [LeadFormBatchUpdate, _$LeadFormBatchUpdate];

  @override
  final String wireName = r'LeadFormBatchUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadFormBatchUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.completionMessage != null) {
      yield r'completion_message';
      yield serializers.serialize(
        object.completionMessage,
        specifiedType: const FullType.nullable(String),
      );
    }
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
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.policyLinks != null) {
      yield r'policy_links';
      yield serializers.serialize(
        object.policyLinks,
        specifiedType: const FullType(BuiltList, [FullType(LeadFormPolicyLink)]),
      );
    }
    if (object.privacyPolicyLink != null) {
      yield r'privacy_policy_link';
      yield serializers.serialize(
        object.privacyPolicyLink,
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
    LeadFormBatchUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadFormBatchUpdateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'completion_message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.completionMessage = valueDes;
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
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.hasAcceptedTerms = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'policy_links':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(LeadFormPolicyLink)]),
          ) as BuiltList<LeadFormPolicyLink>?;
          if (valueDes == null) continue;
          result.policyLinks.replace(valueDes);
          break;
        case r'privacy_policy_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.privacyPolicyLink = valueDes;
          break;
        case r'questions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(LeadFormQuestion)]),
          ) as BuiltList<LeadFormQuestion>?;
          if (valueDes == null) continue;
          result.questions.replace(valueDes);
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(LeadFormStatus),
          ) as LeadFormStatus?;
          if (valueDes == null) continue;
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
  LeadFormBatchUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadFormBatchUpdateBuilder();
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

