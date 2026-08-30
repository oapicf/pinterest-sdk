//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad.dart';
import 'package:openapi/src/model/pinterest_lib_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_batch_item.g.dart';

/// AdBatchItem
///
/// Properties:
/// * [data] 
/// * [exceptions] 
@BuiltValue()
abstract class AdBatchItem implements Built<AdBatchItem, AdBatchItemBuilder> {
  @BuiltValueField(wireName: r'data')
  Ad? get data;

  @BuiltValueField(wireName: r'exceptions')
  PinterestLibError? get exceptions;

  AdBatchItem._();

  factory AdBatchItem([void updates(AdBatchItemBuilder b)]) = _$AdBatchItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdBatchItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdBatchItem> get serializer => _$AdBatchItemSerializer();
}

class _$AdBatchItemSerializer implements PrimitiveSerializer<AdBatchItem> {
  @override
  final Iterable<Type> types = const [AdBatchItem, _$AdBatchItem];

  @override
  final String wireName = r'AdBatchItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdBatchItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(Ad),
      );
    }
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType(PinterestLibError),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdBatchItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdBatchItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Ad),
          ) as Ad?;
          if (valueDes == null) continue;
          result.data.replace(valueDes);
          break;
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PinterestLibError),
          ) as PinterestLibError?;
          if (valueDes == null) continue;
          result.exceptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdBatchItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdBatchItemBuilder();
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

