//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/targeting_template_audience_sizing.dart';
import 'package:openapi/src/model/targeting_template_keyword.dart';
import 'package:openapi/src/model/tracking_urls.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec.dart';
import 'package:openapi/src/model/targeting_template_common.dart';
import 'package:openapi/src/model/placement_group_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_template_response_data.g.dart';

/// TargetingTemplateResponseData
///
/// Properties:
/// * [autoTargetingEnabled] - Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
/// * [keywords] 
/// * [name] - targeting template name
/// * [placementGroup] 
/// * [targetingAttributes] 
/// * [trackingUrls] 
/// * [adAccountId] - The ID of the advertiser that this targeting template belongs to.
/// * [createdTime] - Targeting template created time. Unix timestamp in seconds.
/// * [id] - Targeting template ID.
/// * [sizing] 
/// * [status] - Indicate targeting template is active or Deleted
/// * [updatedTime] - Targeting template updated time.Unix timestamp in seconds.
@BuiltValue(instantiable: false)
abstract class TargetingTemplateResponseData implements TargetingTemplateCommon {
  @BuiltValueField(wireName: r'sizing')
  TargetingTemplateAudienceSizing? get sizing;

  /// Targeting template updated time.Unix timestamp in seconds.
  @BuiltValueField(wireName: r'updated_time')
  int? get updatedTime;

  /// The ID of the advertiser that this targeting template belongs to.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// Targeting template created time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'created_time')
  int? get createdTime;

  /// Targeting template ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Indicate targeting template is active or Deleted
  @BuiltValueField(wireName: r'status')
  TargetingTemplateResponseDataStatusEnum? get status;
  // enum statusEnum {  ACTIVE,  DELETED,  };

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingTemplateResponseData> get serializer => _$TargetingTemplateResponseDataSerializer();
}

class _$TargetingTemplateResponseDataSerializer implements PrimitiveSerializer<TargetingTemplateResponseData> {
  @override
  final Iterable<Type> types = const [TargetingTemplateResponseData];

  @override
  final String wireName = r'TargetingTemplateResponseData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingTemplateResponseData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.sizing != null) {
      yield r'sizing';
      yield serializers.serialize(
        object.sizing,
        specifiedType: const FullType.nullable(TargetingTemplateAudienceSizing),
      );
    }
    if (object.updatedTime != null) {
      yield r'updated_time';
      yield serializers.serialize(
        object.updatedTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.autoTargetingEnabled != null) {
      yield r'auto_targeting_enabled';
      yield serializers.serialize(
        object.autoTargetingEnabled,
        specifiedType: const FullType(bool),
      );
    }
    if (object.keywords != null) {
      yield r'keywords';
      yield serializers.serialize(
        object.keywords,
        specifiedType: const FullType(BuiltList, [FullType(TargetingTemplateKeyword)]),
      );
    }
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.placementGroup != null) {
      yield r'placement_group';
      yield serializers.serialize(
        object.placementGroup,
        specifiedType: const FullType(PlacementGroupType),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.trackingUrls != null) {
      yield r'tracking_urls';
      yield serializers.serialize(
        object.trackingUrls,
        specifiedType: const FullType.nullable(TrackingUrls),
      );
    }
    if (object.targetingAttributes != null) {
      yield r'targeting_attributes';
      yield serializers.serialize(
        object.targetingAttributes,
        specifiedType: const FullType(TargetingSpec),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(TargetingTemplateResponseDataStatusEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingTemplateResponseData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  TargetingTemplateResponseData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($TargetingTemplateResponseData)) as $TargetingTemplateResponseData;
  }
}

/// a concrete implementation of [TargetingTemplateResponseData], since [TargetingTemplateResponseData] is not instantiable
@BuiltValue(instantiable: true)
abstract class $TargetingTemplateResponseData implements TargetingTemplateResponseData, Built<$TargetingTemplateResponseData, $TargetingTemplateResponseDataBuilder> {
  $TargetingTemplateResponseData._();

  factory $TargetingTemplateResponseData([void Function($TargetingTemplateResponseDataBuilder)? updates]) = _$$TargetingTemplateResponseData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($TargetingTemplateResponseDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$TargetingTemplateResponseData> get serializer => _$$TargetingTemplateResponseDataSerializer();
}

class _$$TargetingTemplateResponseDataSerializer implements PrimitiveSerializer<$TargetingTemplateResponseData> {
  @override
  final Iterable<Type> types = const [$TargetingTemplateResponseData, _$$TargetingTemplateResponseData];

  @override
  final String wireName = r'$TargetingTemplateResponseData';

  @override
  Object serialize(
    Serializers serializers,
    $TargetingTemplateResponseData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(TargetingTemplateResponseData))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingTemplateResponseDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sizing':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TargetingTemplateAudienceSizing),
          ) as TargetingTemplateAudienceSizing?;
          if (valueDes == null) continue;
          result.sizing.replace(valueDes);
          break;
        case r'updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.updatedTime = valueDes;
          break;
        case r'auto_targeting_enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.autoTargetingEnabled = valueDes;
          break;
        case r'keywords':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TargetingTemplateKeyword)]),
          ) as BuiltList<TargetingTemplateKeyword>;
          result.keywords.replace(valueDes);
          break;
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdTime = valueDes;
          break;
        case r'placement_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PlacementGroupType),
          ) as PlacementGroupType;
          result.placementGroup = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'tracking_urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TrackingUrls),
          ) as TrackingUrls?;
          if (valueDes == null) continue;
          result.trackingUrls.replace(valueDes);
          break;
        case r'targeting_attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpec),
          ) as TargetingSpec;
          result.targetingAttributes.replace(valueDes);
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingTemplateResponseDataStatusEnum),
          ) as TargetingTemplateResponseDataStatusEnum;
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
  $TargetingTemplateResponseData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $TargetingTemplateResponseDataBuilder();
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

class TargetingTemplateResponseDataStatusEnum extends EnumClass {

  /// Indicate targeting template is active or Deleted
  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const TargetingTemplateResponseDataStatusEnum ACTIVE = _$targetingTemplateResponseDataStatusEnum_ACTIVE;
  /// Indicate targeting template is active or Deleted
  @BuiltValueEnumConst(wireName: r'DELETED')
  static const TargetingTemplateResponseDataStatusEnum DELETED = _$targetingTemplateResponseDataStatusEnum_DELETED;

  static Serializer<TargetingTemplateResponseDataStatusEnum> get serializer => _$targetingTemplateResponseDataStatusEnumSerializer;

  const TargetingTemplateResponseDataStatusEnum._(String name): super(name);

  static BuiltSet<TargetingTemplateResponseDataStatusEnum> get values => _$targetingTemplateResponseDataStatusEnumValues;
  static TargetingTemplateResponseDataStatusEnum valueOf(String name) => _$targetingTemplateResponseDataStatusEnumValueOf(name);
}

