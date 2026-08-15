//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/update_partner_results_response_array_items_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_partner_results_response_array.g.dart';

/// UpdatePartnerResultsResponseArray
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class UpdatePartnerResultsResponseArray implements Built<UpdatePartnerResultsResponseArray, UpdatePartnerResultsResponseArrayBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<UpdatePartnerResultsResponseArrayItemsInner>? get items;

  UpdatePartnerResultsResponseArray._();

  factory UpdatePartnerResultsResponseArray([void updates(UpdatePartnerResultsResponseArrayBuilder b)]) = _$UpdatePartnerResultsResponseArray;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdatePartnerResultsResponseArrayBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdatePartnerResultsResponseArray> get serializer => _$UpdatePartnerResultsResponseArraySerializer();
}

class _$UpdatePartnerResultsResponseArraySerializer implements PrimitiveSerializer<UpdatePartnerResultsResponseArray> {
  @override
  final Iterable<Type> types = const [UpdatePartnerResultsResponseArray, _$UpdatePartnerResultsResponseArray];

  @override
  final String wireName = r'UpdatePartnerResultsResponseArray';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdatePartnerResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(UpdatePartnerResultsResponseArrayItemsInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdatePartnerResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdatePartnerResultsResponseArrayBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(UpdatePartnerResultsResponseArrayItemsInner)]),
          ) as BuiltList<UpdatePartnerResultsResponseArrayItemsInner>;
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
  UpdatePartnerResultsResponseArray deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdatePartnerResultsResponseArrayBuilder();
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

