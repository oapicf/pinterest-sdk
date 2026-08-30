//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/targeting_template_keyword.dart';
import 'package:openapi/src/model/tracking_urls.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_optimal.dart';
import 'package:openapi/src/model/placement_group_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_template_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [autoTargetingEnabled] - Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
/// * [keywords] 
/// * [name] - targeting template name
/// * [placementGroup] 
/// * [targetingAttributes] - targeting profile attributes
/// * [trackingUrls] 
@BuiltValue()
abstract class TargetingTemplateCreate implements Built<TargetingTemplateCreate, TargetingTemplateCreateBuilder> {
  /// Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
  @BuiltValueField(wireName: r'auto_targeting_enabled')
  bool? get autoTargetingEnabled;

  @BuiltValueField(wireName: r'keywords')
  BuiltList<TargetingTemplateKeyword>? get keywords;

  /// targeting template name
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'placement_group')
  PlacementGroupType? get placementGroup;
  // enum placementGroupEnum {  ALL,  SEARCH,  BROWSE,  OTHER,  };

  /// targeting profile attributes
  @BuiltValueField(wireName: r'targeting_attributes')
  TargetingSpecOptimal get targetingAttributes;

  @BuiltValueField(wireName: r'tracking_urls')
  TrackingUrls? get trackingUrls;

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
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.autoTargetingEnabled = valueDes;
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

