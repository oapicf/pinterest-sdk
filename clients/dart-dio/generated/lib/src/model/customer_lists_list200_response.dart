//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/customer_list.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_lists_list200_response.g.dart';

/// CustomerListsList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class CustomerListsList200Response implements Built<CustomerListsList200Response, CustomerListsList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<CustomerList> get items;

  CustomerListsList200Response._();

  factory CustomerListsList200Response([void updates(CustomerListsList200ResponseBuilder b)]) = _$CustomerListsList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomerListsList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomerListsList200Response> get serializer => _$CustomerListsList200ResponseSerializer();
}

class _$CustomerListsList200ResponseSerializer implements PrimitiveSerializer<CustomerListsList200Response> {
  @override
  final Iterable<Type> types = const [CustomerListsList200Response, _$CustomerListsList200Response];

  @override
  final String wireName = r'CustomerListsList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomerListsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bookmark != null) {
      yield r'bookmark';
      yield serializers.serialize(
        object.bookmark,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(CustomerList)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomerListsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomerListsList200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bookmark':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bookmark = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CustomerList)]),
          ) as BuiltList<CustomerList>;
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
  CustomerListsList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomerListsList200ResponseBuilder();
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

