//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pinterest_lib_batch_item_exception.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/lead_form.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_forms_create200_response_items_inner.g.dart';

/// LeadFormsCreate200ResponseItemsInner
///
/// Properties:
/// * [data] 
/// * [exceptions] 
@BuiltValue()
abstract class LeadFormsCreate200ResponseItemsInner implements Built<LeadFormsCreate200ResponseItemsInner, LeadFormsCreate200ResponseItemsInnerBuilder> {
  @BuiltValueField(wireName: r'data')
  LeadForm? get data;

  @BuiltValueField(wireName: r'exceptions')
  BuiltList<PinterestLibBatchItemException>? get exceptions;

  LeadFormsCreate200ResponseItemsInner._();

  factory LeadFormsCreate200ResponseItemsInner([void updates(LeadFormsCreate200ResponseItemsInnerBuilder b)]) = _$LeadFormsCreate200ResponseItemsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadFormsCreate200ResponseItemsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadFormsCreate200ResponseItemsInner> get serializer => _$LeadFormsCreate200ResponseItemsInnerSerializer();
}

class _$LeadFormsCreate200ResponseItemsInnerSerializer implements PrimitiveSerializer<LeadFormsCreate200ResponseItemsInner> {
  @override
  final Iterable<Type> types = const [LeadFormsCreate200ResponseItemsInner, _$LeadFormsCreate200ResponseItemsInner];

  @override
  final String wireName = r'LeadFormsCreate200ResponseItemsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadFormsCreate200ResponseItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(LeadForm),
      );
    }
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType(BuiltList, [FullType(PinterestLibBatchItemException)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadFormsCreate200ResponseItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadFormsCreate200ResponseItemsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(LeadForm),
          ) as LeadForm?;
          if (valueDes == null) continue;
          result.data.replace(valueDes);
          break;
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(PinterestLibBatchItemException)]),
          ) as BuiltList<PinterestLibBatchItemException>?;
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
  LeadFormsCreate200ResponseItemsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadFormsCreate200ResponseItemsInnerBuilder();
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

