//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/event_data.dart';
import 'package:openapi/src/model/objective_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_rule.g.dart';

/// JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.example.com\"], \"engager_type\": 1}<br>Learn more about <a href=\"/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience\" target=\"_blank\">engagement audiences</a>.
///
/// Properties:
/// * [adAccountId] - Ad account ID.
/// * [adId] - Ad ID for engagement audience filter.
/// * [campaignId] - Campaign ID for engagement audience filter.
/// * [country] - Valid countries include: \"US\", \"CA\", and \"GB\".
/// * [customerListId] - Customer list ID. For CUSTOMER_LIST `audience_type`.
/// * [engagementDomain] - The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
/// * [engagementType] - Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
/// * [engagerType] - Optional for ENGAGEMENT. Engager type value should be 1-2.
/// * [event] - A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
/// * [eventData] 
/// * [eventSource] - Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
/// * [ingestionSource] - Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
/// * [objectiveType] - Objective for engagement audience filter.
/// * [percentage] - Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
/// * [pinId] - IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
/// * [prefill] - Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
/// * [retentionDays] - Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
/// * [seedId] - Audience ID(s). For ACTALIKE `audience_type`. 
/// * [url] - Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
/// * [visitorSourceId] - The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
@BuiltValue()
abstract class AudienceRule implements Built<AudienceRule, AudienceRuleBuilder> {
  /// Ad account ID.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// Ad ID for engagement audience filter.
  @BuiltValueField(wireName: r'ad_id')
  BuiltList<String>? get adId;

  /// Campaign ID for engagement audience filter.
  @BuiltValueField(wireName: r'campaign_id')
  BuiltList<String>? get campaignId;

  /// Valid countries include: \"US\", \"CA\", and \"GB\".
  @BuiltValueField(wireName: r'country')
  String? get country;

  /// Customer list ID. For CUSTOMER_LIST `audience_type`.
  @BuiltValueField(wireName: r'customer_list_id')
  String? get customerListId;

  /// The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
  @BuiltValueField(wireName: r'engagement_domain')
  BuiltList<String>? get engagementDomain;

  /// Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
  @BuiltValueField(wireName: r'engagement_type')
  String? get engagementType;

  /// Optional for ENGAGEMENT. Engager type value should be 1-2.
  @BuiltValueField(wireName: r'engager_type')
  int? get engagerType;

  /// A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
  @BuiltValueField(wireName: r'event')
  String? get event;

  @BuiltValueField(wireName: r'event_data')
  EventData? get eventData;

  /// Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
  @BuiltValueField(wireName: r'event_source')
  JsonObject? get eventSource;

  /// Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
  @BuiltValueField(wireName: r'ingestion_source')
  JsonObject? get ingestionSource;

  /// Objective for engagement audience filter.
  @BuiltValueField(wireName: r'objective_type')
  BuiltList<ObjectiveType>? get objectiveType;

  /// Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
  @BuiltValueField(wireName: r'percentage')
  int? get percentage;

  /// IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
  @BuiltValueField(wireName: r'pin_id')
  BuiltList<String>? get pinId;

  /// Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
  @BuiltValueField(wireName: r'prefill')
  bool? get prefill;

  /// Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
  @BuiltValueField(wireName: r'retention_days')
  int? get retentionDays;

  /// Audience ID(s). For ACTALIKE `audience_type`. 
  @BuiltValueField(wireName: r'seed_id')
  BuiltList<String>? get seedId;

  /// Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
  @BuiltValueField(wireName: r'url')
  BuiltList<String>? get url;

  /// The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
  @BuiltValueField(wireName: r'visitor_source_id')
  String? get visitorSourceId;

  AudienceRule._();

  factory AudienceRule([void updates(AudienceRuleBuilder b)]) = _$AudienceRule;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceRuleBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceRule> get serializer => _$AudienceRuleSerializer();
}

class _$AudienceRuleSerializer implements PrimitiveSerializer<AudienceRule> {
  @override
  final Iterable<Type> types = const [AudienceRule, _$AudienceRule];

  @override
  final String wireName = r'AudienceRule';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceRule object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.adId != null) {
      yield r'ad_id';
      yield serializers.serialize(
        object.adId,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.campaignId != null) {
      yield r'campaign_id';
      yield serializers.serialize(
        object.campaignId,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.country != null) {
      yield r'country';
      yield serializers.serialize(
        object.country,
        specifiedType: const FullType(String),
      );
    }
    if (object.customerListId != null) {
      yield r'customer_list_id';
      yield serializers.serialize(
        object.customerListId,
        specifiedType: const FullType(String),
      );
    }
    if (object.engagementDomain != null) {
      yield r'engagement_domain';
      yield serializers.serialize(
        object.engagementDomain,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.engagementType != null) {
      yield r'engagement_type';
      yield serializers.serialize(
        object.engagementType,
        specifiedType: const FullType(String),
      );
    }
    if (object.engagerType != null) {
      yield r'engager_type';
      yield serializers.serialize(
        object.engagerType,
        specifiedType: const FullType(int),
      );
    }
    if (object.event != null) {
      yield r'event';
      yield serializers.serialize(
        object.event,
        specifiedType: const FullType(String),
      );
    }
    if (object.eventData != null) {
      yield r'event_data';
      yield serializers.serialize(
        object.eventData,
        specifiedType: const FullType(EventData),
      );
    }
    if (object.eventSource != null) {
      yield r'event_source';
      yield serializers.serialize(
        object.eventSource,
        specifiedType: const FullType(JsonObject),
      );
    }
    if (object.ingestionSource != null) {
      yield r'ingestion_source';
      yield serializers.serialize(
        object.ingestionSource,
        specifiedType: const FullType(JsonObject),
      );
    }
    if (object.objectiveType != null) {
      yield r'objective_type';
      yield serializers.serialize(
        object.objectiveType,
        specifiedType: const FullType(BuiltList, [FullType(ObjectiveType)]),
      );
    }
    if (object.percentage != null) {
      yield r'percentage';
      yield serializers.serialize(
        object.percentage,
        specifiedType: const FullType(int),
      );
    }
    if (object.pinId != null) {
      yield r'pin_id';
      yield serializers.serialize(
        object.pinId,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.prefill != null) {
      yield r'prefill';
      yield serializers.serialize(
        object.prefill,
        specifiedType: const FullType(bool),
      );
    }
    if (object.retentionDays != null) {
      yield r'retention_days';
      yield serializers.serialize(
        object.retentionDays,
        specifiedType: const FullType(int),
      );
    }
    if (object.seedId != null) {
      yield r'seed_id';
      yield serializers.serialize(
        object.seedId,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.url != null) {
      yield r'url';
      yield serializers.serialize(
        object.url,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.visitorSourceId != null) {
      yield r'visitor_source_id';
      yield serializers.serialize(
        object.visitorSourceId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceRule object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceRuleBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        case r'ad_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.adId.replace(valueDes);
          break;
        case r'campaign_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.campaignId.replace(valueDes);
          break;
        case r'country':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.country = valueDes;
          break;
        case r'customer_list_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.customerListId = valueDes;
          break;
        case r'engagement_domain':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.engagementDomain.replace(valueDes);
          break;
        case r'engagement_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.engagementType = valueDes;
          break;
        case r'engager_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.engagerType = valueDes;
          break;
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.event = valueDes;
          break;
        case r'event_data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EventData),
          ) as EventData;
          result.eventData.replace(valueDes);
          break;
        case r'event_source':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(JsonObject),
          ) as JsonObject;
          result.eventSource = valueDes;
          break;
        case r'ingestion_source':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(JsonObject),
          ) as JsonObject;
          result.ingestionSource = valueDes;
          break;
        case r'objective_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ObjectiveType)]),
          ) as BuiltList<ObjectiveType>;
          result.objectiveType.replace(valueDes);
          break;
        case r'percentage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.percentage = valueDes;
          break;
        case r'pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.pinId.replace(valueDes);
          break;
        case r'prefill':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.prefill = valueDes;
          break;
        case r'retention_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.retentionDays = valueDes;
          break;
        case r'seed_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.seedId.replace(valueDes);
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.url.replace(valueDes);
          break;
        case r'visitor_source_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.visitorSourceId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AudienceRule deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceRuleBuilder();
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

