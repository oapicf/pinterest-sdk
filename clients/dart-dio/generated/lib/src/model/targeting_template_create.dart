//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/targeting_template_keyword.dart';
import 'package:openapi/src/model/tracking_urls.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec.dart';
import 'package:openapi/src/model/targeting_template_common.dart';
import 'package:openapi/src/model/placement_group_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_template_create.g.dart';

/// TargetingTemplateCreate
///
/// Properties:
/// * [autoTargetingEnabled] - Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
/// * [keywords] 
/// * [name] - Name of targeting template.
/// * [placementGroup] 
/// * [targetingAttributes] 
/// * [trackingUrls] 
@BuiltValue()
abstract class TargetingTemplateCreate implements TargetingTemplateCommon, Built<TargetingTemplateCreate, TargetingTemplateCreateBuilder> {
  TargetingTemplateCreate._();

  factory TargetingTemplateCreate([void updates(TargetingTemplateCreateBuilder b)]) = _$TargetingTemplateCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingTemplateCreateBuilder b) => b
      ..autoTargetingEnabled = true;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingTemplateCreate> get serializer => _$TargetingTemplateCreateSerializer();
}

class _$TargetingTemplateCreateSerializer implements PrimitiveSerializer<TargetingTemplateCreate> {
  @override
  final Iterable<Type> types = const [TargetingTemplateCreate, _$TargetingTemplateCreate];

  @override
  final String wireName = r'TargetingTemplateCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingTemplateCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.placementGroup != null) {
      yield r'placement_group';
      yield serializers.serialize(
        object.placementGroup,
        specifiedType: const FullType(PlacementGroupType),
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
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingTemplateCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingTemplateCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
            specifiedType: const FullType(PlacementGroupType),
          ) as PlacementGroupType;
          result.placementGroup = valueDes;
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TargetingTemplateCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingTemplateCreateBuilder();
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

