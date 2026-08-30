//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/targeting_template_audience_sizing.dart';
import 'package:openapi/src/model/targeting_template_keyword.dart';
import 'package:openapi/src/model/tracking_urls.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_optimal.dart';
import 'package:openapi/src/model/targeting_template_status.dart';
import 'package:openapi/src/model/placement_group_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_template.g.dart';

/// TargetingTemplate
///
/// Properties:
/// * [adAccountId] - The ID of the advertiser that this targeting template belongs to.
/// * [autoTargetingEnabled] - Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
/// * [createdTime] - Targeting template created time. Unix timestamp in seconds.
/// * [id] - Targeting template ID.
/// * [keywords] 
/// * [name] - targeting template name
/// * [placementGroup] 
/// * [sizing] 
/// * [status] - Indicate targeting template is active or Deleted
/// * [targetingAttributes] - targeting profile attributes
/// * [trackingUrls] 
/// * [updatedTime] - Targeting template updated time.Unix timestamp in seconds.
/// * [valid] - Inform if the targeting template is valid (ex. would be false if has revoked audience)
@BuiltValue()
abstract class TargetingTemplate implements Built<TargetingTemplate, TargetingTemplateBuilder> {
  /// The ID of the advertiser that this targeting template belongs to.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
  @BuiltValueField(wireName: r'auto_targeting_enabled')
  bool? get autoTargetingEnabled;

  /// Targeting template created time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'created_time')
  int? get createdTime;

  /// Targeting template ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'keywords')
  BuiltList<TargetingTemplateKeyword>? get keywords;

  /// targeting template name
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'placement_group')
  PlacementGroupType? get placementGroup;
  // enum placementGroupEnum {  ALL,  SEARCH,  BROWSE,  OTHER,  };

  @BuiltValueField(wireName: r'sizing')
  TargetingTemplateAudienceSizing? get sizing;

  /// Indicate targeting template is active or Deleted
  @BuiltValueField(wireName: r'status')
  TargetingTemplateStatus? get status;
  // enum statusEnum {  ACTIVE,  DELETED,  };

  /// targeting profile attributes
  @BuiltValueField(wireName: r'targeting_attributes')
  TargetingSpecOptimal get targetingAttributes;

  @BuiltValueField(wireName: r'tracking_urls')
  TrackingUrls? get trackingUrls;

  /// Targeting template updated time.Unix timestamp in seconds.
  @BuiltValueField(wireName: r'updated_time')
  int? get updatedTime;

  /// Inform if the targeting template is valid (ex. would be false if has revoked audience)
  @BuiltValueField(wireName: r'valid')
  bool? get valid;

  TargetingTemplate._();

  factory TargetingTemplate([void updates(TargetingTemplateBuilder b)]) = _$TargetingTemplate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingTemplateBuilder b) => b
      ..autoTargetingEnabled = true;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingTemplate> get serializer => _$TargetingTemplateSerializer();
}

class _$TargetingTemplateSerializer implements PrimitiveSerializer<TargetingTemplate> {
  @override
  final Iterable<Type> types = const [TargetingTemplate, _$TargetingTemplate];

  @override
  final String wireName = r'TargetingTemplate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingTemplate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.autoTargetingEnabled != null) {
      yield r'auto_targeting_enabled';
      yield serializers.serialize(
        object.autoTargetingEnabled,
        specifiedType: const FullType(bool),
      );
    }
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.keywords != null) {
      yield r'keywords';
      yield serializers.serialize(
        object.keywords,
        specifiedType: const FullType(BuiltList, [FullType(TargetingTemplateKeyword)]),
      );
    }
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.placementGroup != null) {
      yield r'placement_group';
      yield serializers.serialize(
        object.placementGroup,
        specifiedType: const FullType(PlacementGroupType),
      );
    }
    if (object.sizing != null) {
      yield r'sizing';
      yield serializers.serialize(
        object.sizing,
        specifiedType: const FullType.nullable(TargetingTemplateAudienceSizing),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(TargetingTemplateStatus),
      );
    }
    yield r'targeting_attributes';
    yield serializers.serialize(
      object.targetingAttributes,
      specifiedType: const FullType(TargetingSpecOptimal),
    );
    if (object.trackingUrls != null) {
      yield r'tracking_urls';
      yield serializers.serialize(
        object.trackingUrls,
        specifiedType: const FullType.nullable(TrackingUrls),
      );
    }
    if (object.updatedTime != null) {
      yield r'updated_time';
      yield serializers.serialize(
        object.updatedTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.valid != null) {
      yield r'valid';
      yield serializers.serialize(
        object.valid,
        specifiedType: const FullType.nullable(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingTemplate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingTemplateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.adAccountId = valueDes;
          break;
        case r'auto_targeting_enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.autoTargetingEnabled = valueDes;
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.createdTime = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'keywords':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(TargetingTemplateKeyword)]),
          ) as BuiltList<TargetingTemplateKeyword>?;
          if (valueDes == null) continue;
          result.keywords.replace(valueDes);
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'placement_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PlacementGroupType),
          ) as PlacementGroupType?;
          if (valueDes == null) continue;
          result.placementGroup = valueDes;
          break;
        case r'sizing':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TargetingTemplateAudienceSizing),
          ) as TargetingTemplateAudienceSizing?;
          if (valueDes == null) continue;
          result.sizing.replace(valueDes);
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TargetingTemplateStatus),
          ) as TargetingTemplateStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        case r'targeting_attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOptimal),
          ) as TargetingSpecOptimal;
          result.targetingAttributes.replace(valueDes);
          break;
        case r'tracking_urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TrackingUrls),
          ) as TrackingUrls?;
          if (valueDes == null) continue;
          result.trackingUrls.replace(valueDes);
          break;
        case r'updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.updatedTime = valueDes;
          break;
        case r'valid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.valid = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TargetingTemplate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingTemplateBuilder();
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

