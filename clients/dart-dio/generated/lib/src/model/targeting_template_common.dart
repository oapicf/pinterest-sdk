//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/targeting_template_keyword.dart';
import 'package:openapi/src/model/tracking_urls.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec.dart';
import 'package:openapi/src/model/placement_group_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_template_common.g.dart';

/// TargetingTemplateCommon
///
/// Properties:
/// * [autoTargetingEnabled] - Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
/// * [keywords] 
/// * [name] - targeting template name
/// * [placementGroup] 
/// * [targetingAttributes] 
/// * [trackingUrls] 
@BuiltValue(instantiable: false)
abstract class TargetingTemplateCommon  {
  /// Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  @BuiltValueField(wireName: r'auto_targeting_enabled')
  bool? get autoTargetingEnabled;

  @BuiltValueField(wireName: r'keywords')
  BuiltList<TargetingTemplateKeyword>? get keywords;

  /// targeting template name
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'placement_group')
  PlacementGroupType? get placementGroup;
  // enum placementGroupEnum {  ALL,  SEARCH,  BROWSE,  OTHER,  };

  @BuiltValueField(wireName: r'targeting_attributes')
  TargetingSpec? get targetingAttributes;

  @BuiltValueField(wireName: r'tracking_urls')
  TrackingUrls? get trackingUrls;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingTemplateCommon> get serializer => _$TargetingTemplateCommonSerializer();
}

class _$TargetingTemplateCommonSerializer implements PrimitiveSerializer<TargetingTemplateCommon> {
  @override
  final Iterable<Type> types = const [TargetingTemplateCommon];

  @override
  final String wireName = r'TargetingTemplateCommon';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingTemplateCommon object, {
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
    if (object.targetingAttributes != null) {
      yield r'targeting_attributes';
      yield serializers.serialize(
        object.targetingAttributes,
        specifiedType: const FullType(TargetingSpec),
      );
    }
    if (object.trackingUrls != null) {
      yield r'tracking_urls';
      yield serializers.serialize(
        object.trackingUrls,
        specifiedType: const FullType.nullable(TrackingUrls),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingTemplateCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  TargetingTemplateCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($TargetingTemplateCommon)) as $TargetingTemplateCommon;
  }
}

/// a concrete implementation of [TargetingTemplateCommon], since [TargetingTemplateCommon] is not instantiable
@BuiltValue(instantiable: true)
abstract class $TargetingTemplateCommon implements TargetingTemplateCommon, Built<$TargetingTemplateCommon, $TargetingTemplateCommonBuilder> {
  $TargetingTemplateCommon._();

  factory $TargetingTemplateCommon([void Function($TargetingTemplateCommonBuilder)? updates]) = _$$TargetingTemplateCommon;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($TargetingTemplateCommonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$TargetingTemplateCommon> get serializer => _$$TargetingTemplateCommonSerializer();
}

class _$$TargetingTemplateCommonSerializer implements PrimitiveSerializer<$TargetingTemplateCommon> {
  @override
  final Iterable<Type> types = const [$TargetingTemplateCommon, _$$TargetingTemplateCommon];

  @override
  final String wireName = r'$TargetingTemplateCommon';

  @override
  Object serialize(
    Serializers serializers,
    $TargetingTemplateCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(TargetingTemplateCommon))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingTemplateCommonBuilder result,
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
        case r'targeting_attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpec),
          ) as TargetingSpec;
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $TargetingTemplateCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $TargetingTemplateCommonBuilder();
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

