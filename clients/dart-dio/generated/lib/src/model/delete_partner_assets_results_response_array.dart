//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/delete_partner_assets_result.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_partner_assets_results_response_array.g.dart';

/// DeletePartnerAssetsResultsResponseArray
///
/// Properties:
/// * [items] - List of terminated asset access.
@BuiltValue()
abstract class DeletePartnerAssetsResultsResponseArray implements Built<DeletePartnerAssetsResultsResponseArray, DeletePartnerAssetsResultsResponseArrayBuilder> {
  /// List of terminated asset access.
  @BuiltValueField(wireName: r'items')
  BuiltList<DeletePartnerAssetsResult>? get items;

  DeletePartnerAssetsResultsResponseArray._();

  factory DeletePartnerAssetsResultsResponseArray([void updates(DeletePartnerAssetsResultsResponseArrayBuilder b)]) = _$DeletePartnerAssetsResultsResponseArray;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeletePartnerAssetsResultsResponseArrayBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeletePartnerAssetsResultsResponseArray> get serializer => _$DeletePartnerAssetsResultsResponseArraySerializer();
}

class _$DeletePartnerAssetsResultsResponseArraySerializer implements PrimitiveSerializer<DeletePartnerAssetsResultsResponseArray> {
  @override
  final Iterable<Type> types = const [DeletePartnerAssetsResultsResponseArray, _$DeletePartnerAssetsResultsResponseArray];

  @override
  final String wireName = r'DeletePartnerAssetsResultsResponseArray';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeletePartnerAssetsResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(DeletePartnerAssetsResult)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeletePartnerAssetsResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeletePartnerAssetsResultsResponseArrayBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(DeletePartnerAssetsResult)]),
          ) as BuiltList<DeletePartnerAssetsResult>;
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
  DeletePartnerAssetsResultsResponseArray deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeletePartnerAssetsResultsResponseArrayBuilder();
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

