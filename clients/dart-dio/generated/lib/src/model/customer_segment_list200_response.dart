//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/customer_segment.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_segment_list200_response.g.dart';

/// CustomerSegmentList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class CustomerSegmentList200Response implements Built<CustomerSegmentList200Response, CustomerSegmentList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<CustomerSegment> get items;

  CustomerSegmentList200Response._();

  factory CustomerSegmentList200Response([void updates(CustomerSegmentList200ResponseBuilder b)]) = _$CustomerSegmentList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomerSegmentList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomerSegmentList200Response> get serializer => _$CustomerSegmentList200ResponseSerializer();
}

class _$CustomerSegmentList200ResponseSerializer implements PrimitiveSerializer<CustomerSegmentList200Response> {
  @override
  final Iterable<Type> types = const [CustomerSegmentList200Response, _$CustomerSegmentList200Response];

  @override
  final String wireName = r'CustomerSegmentList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomerSegmentList200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(CustomerSegment)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomerSegmentList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomerSegmentList200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(CustomerSegment)]),
          ) as BuiltList<CustomerSegment>;
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
  CustomerSegmentList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomerSegmentList200ResponseBuilder();
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

