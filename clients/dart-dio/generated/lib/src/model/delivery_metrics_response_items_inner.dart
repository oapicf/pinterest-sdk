//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delivery_metrics_response_items_inner.g.dart';

/// DeliveryMetricsResponseItemsInner
///
/// Properties:
/// * [category] - Category name
/// * [definition] - How the metric is defined.
/// * [displayName] - Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
/// * [name] - Metric's name.
@BuiltValue()
abstract class DeliveryMetricsResponseItemsInner implements Built<DeliveryMetricsResponseItemsInner, DeliveryMetricsResponseItemsInnerBuilder> {
  /// Category name
  @BuiltValueField(wireName: r'category')
  DeliveryMetricsResponseItemsInnerCategoryEnum? get category;
  // enum categoryEnum {  ADS,  ORGANIC,  };

  /// How the metric is defined.
  @BuiltValueField(wireName: r'definition')
  String? get definition;

  /// Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
  @BuiltValueField(wireName: r'display_name')
  String? get displayName;

  /// Metric's name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  DeliveryMetricsResponseItemsInner._();

  factory DeliveryMetricsResponseItemsInner([void updates(DeliveryMetricsResponseItemsInnerBuilder b)]) = _$DeliveryMetricsResponseItemsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeliveryMetricsResponseItemsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeliveryMetricsResponseItemsInner> get serializer => _$DeliveryMetricsResponseItemsInnerSerializer();
}

class _$DeliveryMetricsResponseItemsInnerSerializer implements PrimitiveSerializer<DeliveryMetricsResponseItemsInner> {
  @override
  final Iterable<Type> types = const [DeliveryMetricsResponseItemsInner, _$DeliveryMetricsResponseItemsInner];

  @override
  final String wireName = r'DeliveryMetricsResponseItemsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeliveryMetricsResponseItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.category != null) {
      yield r'category';
      yield serializers.serialize(
        object.category,
        specifiedType: const FullType(DeliveryMetricsResponseItemsInnerCategoryEnum),
      );
    }
    if (object.definition != null) {
      yield r'definition';
      yield serializers.serialize(
        object.definition,
        specifiedType: const FullType(String),
      );
    }
    if (object.displayName != null) {
      yield r'display_name';
      yield serializers.serialize(
        object.displayName,
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
  }

  @override
  Object serialize(
    Serializers serializers,
    DeliveryMetricsResponseItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeliveryMetricsResponseItemsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DeliveryMetricsResponseItemsInnerCategoryEnum),
          ) as DeliveryMetricsResponseItemsInnerCategoryEnum;
          result.category = valueDes;
          break;
        case r'definition':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.definition = valueDes;
          break;
        case r'display_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.displayName = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeliveryMetricsResponseItemsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeliveryMetricsResponseItemsInnerBuilder();
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

class DeliveryMetricsResponseItemsInnerCategoryEnum extends EnumClass {

  /// Category name
  @BuiltValueEnumConst(wireName: r'ADS')
  static const DeliveryMetricsResponseItemsInnerCategoryEnum ADS = _$deliveryMetricsResponseItemsInnerCategoryEnum_ADS;
  /// Category name
  @BuiltValueEnumConst(wireName: r'ORGANIC')
  static const DeliveryMetricsResponseItemsInnerCategoryEnum ORGANIC = _$deliveryMetricsResponseItemsInnerCategoryEnum_ORGANIC;

  static Serializer<DeliveryMetricsResponseItemsInnerCategoryEnum> get serializer => _$deliveryMetricsResponseItemsInnerCategoryEnumSerializer;

  const DeliveryMetricsResponseItemsInnerCategoryEnum._(String name): super(name);

  static BuiltSet<DeliveryMetricsResponseItemsInnerCategoryEnum> get values => _$deliveryMetricsResponseItemsInnerCategoryEnumValues;
  static DeliveryMetricsResponseItemsInnerCategoryEnum valueOf(String name) => _$deliveryMetricsResponseItemsInnerCategoryEnumValueOf(name);
}

