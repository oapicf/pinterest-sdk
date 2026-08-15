//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/lead_form_array_response_items_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_form_array_response.g.dart';

/// LeadFormArrayResponse
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class LeadFormArrayResponse implements Built<LeadFormArrayResponse, LeadFormArrayResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<LeadFormArrayResponseItemsInner>? get items;

  LeadFormArrayResponse._();

  factory LeadFormArrayResponse([void updates(LeadFormArrayResponseBuilder b)]) = _$LeadFormArrayResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadFormArrayResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadFormArrayResponse> get serializer => _$LeadFormArrayResponseSerializer();
}

class _$LeadFormArrayResponseSerializer implements PrimitiveSerializer<LeadFormArrayResponse> {
  @override
  final Iterable<Type> types = const [LeadFormArrayResponse, _$LeadFormArrayResponse];

  @override
  final String wireName = r'LeadFormArrayResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadFormArrayResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(LeadFormArrayResponseItemsInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadFormArrayResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadFormArrayResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LeadFormArrayResponseItemsInner)]),
          ) as BuiltList<LeadFormArrayResponseItemsInner>;
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
  LeadFormArrayResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadFormArrayResponseBuilder();
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

