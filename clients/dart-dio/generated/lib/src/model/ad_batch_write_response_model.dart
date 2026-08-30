//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ad_batch_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_batch_write_response_model.g.dart';

/// AdBatchWriteResponseModel
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class AdBatchWriteResponseModel implements Built<AdBatchWriteResponseModel, AdBatchWriteResponseModelBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<AdBatchItem> get items;

  AdBatchWriteResponseModel._();

  factory AdBatchWriteResponseModel([void updates(AdBatchWriteResponseModelBuilder b)]) = _$AdBatchWriteResponseModel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdBatchWriteResponseModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdBatchWriteResponseModel> get serializer => _$AdBatchWriteResponseModelSerializer();
}

class _$AdBatchWriteResponseModelSerializer implements PrimitiveSerializer<AdBatchWriteResponseModel> {
  @override
  final Iterable<Type> types = const [AdBatchWriteResponseModel, _$AdBatchWriteResponseModel];

  @override
  final String wireName = r'AdBatchWriteResponseModel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdBatchWriteResponseModel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(AdBatchItem)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdBatchWriteResponseModel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdBatchWriteResponseModelBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdBatchItem)]),
          ) as BuiltList<AdBatchItem>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdBatchWriteResponseModel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdBatchWriteResponseModelBuilder();
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

