//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delivery_metrics_response_items_items.g.dart';

/// DeliveryMetricsResponseItemsItems
///
/// Properties:
/// * [category] - Category name
/// * [definition] - How the metric is defined.
/// * [displayName] - Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
/// * [name] - Metric's name.
@BuiltValue()
abstract class DeliveryMetricsResponseItemsItems implements Built<DeliveryMetricsResponseItemsItems, DeliveryMetricsResponseItemsItemsBuilder> {
  /// Category name
  @BuiltValueField(wireName: r'category')
  DeliveryMetricsResponseItemsItemsCategoryEnum? get category;
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

  DeliveryMetricsResponseItemsItems._();

  factory DeliveryMetricsResponseItemsItems([void updates(DeliveryMetricsResponseItemsItemsBuilder b)]) = _$DeliveryMetricsResponseItemsItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeliveryMetricsResponseItemsItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeliveryMetricsResponseItemsItems> get serializer => _$DeliveryMetricsResponseItemsItemsSerializer();
}

class _$DeliveryMetricsResponseItemsItemsSerializer implements PrimitiveSerializer<DeliveryMetricsResponseItemsItems> {
  @override
  final Iterable<Type> types = const [DeliveryMetricsResponseItemsItems, _$DeliveryMetricsResponseItemsItems];

  @override
  final String wireName = r'DeliveryMetricsResponseItemsItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeliveryMetricsResponseItemsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.category != null) {
      yield r'category';
      yield serializers.serialize(
        object.category,
        specifiedType: const FullType(DeliveryMetricsResponseItemsItemsCategoryEnum),
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
    DeliveryMetricsResponseItemsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeliveryMetricsResponseItemsItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DeliveryMetricsResponseItemsItemsCategoryEnum),
          ) as DeliveryMetricsResponseItemsItemsCategoryEnum?;
          if (valueDes == null) continue;
          result.category = valueDes;
          break;
        case r'definition':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.definition = valueDes;
          break;
        case r'display_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.displayName = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  DeliveryMetricsResponseItemsItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeliveryMetricsResponseItemsItemsBuilder();
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

class DeliveryMetricsResponseItemsItemsCategoryEnum extends EnumClass {

  /// Category name
  @BuiltValueEnumConst(wireName: r'ADS')
  static const DeliveryMetricsResponseItemsItemsCategoryEnum ADS = _$deliveryMetricsResponseItemsItemsCategoryEnum_ADS;
  /// Category name
  @BuiltValueEnumConst(wireName: r'ORGANIC')
  static const DeliveryMetricsResponseItemsItemsCategoryEnum ORGANIC = _$deliveryMetricsResponseItemsItemsCategoryEnum_ORGANIC;

  static Serializer<DeliveryMetricsResponseItemsItemsCategoryEnum> get serializer => _$deliveryMetricsResponseItemsItemsCategoryEnumSerializer;

  const DeliveryMetricsResponseItemsItemsCategoryEnum._(String name): super(name);

  static BuiltSet<DeliveryMetricsResponseItemsItemsCategoryEnum> get values => _$deliveryMetricsResponseItemsItemsCategoryEnumValues;
  static DeliveryMetricsResponseItemsItemsCategoryEnum valueOf(String name) => _$deliveryMetricsResponseItemsItemsCategoryEnumValueOf(name);
}

