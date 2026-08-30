//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/delete_partner_asset_access_result.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_partner_asset_access_results_response_array.g.dart';

/// DeletePartnerAssetAccessResultsResponseArray
///
/// Properties:
/// * [items] - List of terminated partner asset accesses.
@BuiltValue()
abstract class DeletePartnerAssetAccessResultsResponseArray implements Built<DeletePartnerAssetAccessResultsResponseArray, DeletePartnerAssetAccessResultsResponseArrayBuilder> {
  /// List of terminated partner asset accesses.
  @BuiltValueField(wireName: r'items')
  BuiltList<DeletePartnerAssetAccessResult>? get items;

  DeletePartnerAssetAccessResultsResponseArray._();

  factory DeletePartnerAssetAccessResultsResponseArray([void updates(DeletePartnerAssetAccessResultsResponseArrayBuilder b)]) = _$DeletePartnerAssetAccessResultsResponseArray;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeletePartnerAssetAccessResultsResponseArrayBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeletePartnerAssetAccessResultsResponseArray> get serializer => _$DeletePartnerAssetAccessResultsResponseArraySerializer();
}

class _$DeletePartnerAssetAccessResultsResponseArraySerializer implements PrimitiveSerializer<DeletePartnerAssetAccessResultsResponseArray> {
  @override
  final Iterable<Type> types = const [DeletePartnerAssetAccessResultsResponseArray, _$DeletePartnerAssetAccessResultsResponseArray];

  @override
  final String wireName = r'DeletePartnerAssetAccessResultsResponseArray';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeletePartnerAssetAccessResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(DeletePartnerAssetAccessResult)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeletePartnerAssetAccessResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeletePartnerAssetAccessResultsResponseArrayBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(DeletePartnerAssetAccessResult)]),
          ) as BuiltList<DeletePartnerAssetAccessResult>?;
          if (valueDes == null) continue;
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
  DeletePartnerAssetAccessResultsResponseArray deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeletePartnerAssetAccessResultsResponseArrayBuilder();
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

