//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/lead_forms_create200_response_items_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_forms_create200_response.g.dart';

/// LeadFormsCreate200Response
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class LeadFormsCreate200Response implements Built<LeadFormsCreate200Response, LeadFormsCreate200ResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<LeadFormsCreate200ResponseItemsInner> get items;

  LeadFormsCreate200Response._();

  factory LeadFormsCreate200Response([void updates(LeadFormsCreate200ResponseBuilder b)]) = _$LeadFormsCreate200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadFormsCreate200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadFormsCreate200Response> get serializer => _$LeadFormsCreate200ResponseSerializer();
}

class _$LeadFormsCreate200ResponseSerializer implements PrimitiveSerializer<LeadFormsCreate200Response> {
  @override
  final Iterable<Type> types = const [LeadFormsCreate200Response, _$LeadFormsCreate200Response];

  @override
  final String wireName = r'LeadFormsCreate200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadFormsCreate200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(LeadFormsCreate200ResponseItemsInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadFormsCreate200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadFormsCreate200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LeadFormsCreate200ResponseItemsInner)]),
          ) as BuiltList<LeadFormsCreate200ResponseItemsInner>;
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
  LeadFormsCreate200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadFormsCreate200ResponseBuilder();
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

