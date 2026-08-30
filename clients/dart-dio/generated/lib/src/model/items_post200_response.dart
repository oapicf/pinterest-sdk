//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'items_post200_response.g.dart';

/// ItemsPost200Response
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class ItemsPost200Response implements Built<ItemsPost200Response, ItemsPost200ResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<ItemResponse> get items;

  ItemsPost200Response._();

  factory ItemsPost200Response([void updates(ItemsPost200ResponseBuilder b)]) = _$ItemsPost200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemsPost200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemsPost200Response> get serializer => _$ItemsPost200ResponseSerializer();
}

class _$ItemsPost200ResponseSerializer implements PrimitiveSerializer<ItemsPost200Response> {
  @override
  final Iterable<Type> types = const [ItemsPost200Response, _$ItemsPost200Response];

  @override
  final String wireName = r'ItemsPost200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemsPost200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(ItemResponse)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemsPost200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemsPost200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemResponse)]),
          ) as BuiltList<ItemResponse>;
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
  ItemsPost200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemsPost200ResponseBuilder();
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

