//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/lead_form_response.dart';
import 'package:openapi/src/model/exception.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_form_array_response_items_inner.g.dart';

/// LeadFormArrayResponseItemsInner
///
/// Properties:
/// * [data] 
/// * [exceptions] 
@BuiltValue()
abstract class LeadFormArrayResponseItemsInner implements Built<LeadFormArrayResponseItemsInner, LeadFormArrayResponseItemsInnerBuilder> {
  @BuiltValueField(wireName: r'data')
  LeadFormResponse? get data;

  @BuiltValueField(wireName: r'exceptions')
  BuiltList<Exception>? get exceptions;

  LeadFormArrayResponseItemsInner._();

  factory LeadFormArrayResponseItemsInner([void updates(LeadFormArrayResponseItemsInnerBuilder b)]) = _$LeadFormArrayResponseItemsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadFormArrayResponseItemsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadFormArrayResponseItemsInner> get serializer => _$LeadFormArrayResponseItemsInnerSerializer();
}

class _$LeadFormArrayResponseItemsInnerSerializer implements PrimitiveSerializer<LeadFormArrayResponseItemsInner> {
  @override
  final Iterable<Type> types = const [LeadFormArrayResponseItemsInner, _$LeadFormArrayResponseItemsInner];

  @override
  final String wireName = r'LeadFormArrayResponseItemsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadFormArrayResponseItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(LeadFormResponse),
      );
    }
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType(BuiltList, [FullType(Exception)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadFormArrayResponseItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadFormArrayResponseItemsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LeadFormResponse),
          ) as LeadFormResponse;
          result.data.replace(valueDes);
          break;
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Exception)]),
          ) as BuiltList<Exception>;
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
  LeadFormArrayResponseItemsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadFormArrayResponseItemsInnerBuilder();
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

