//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/update_member_asset_result_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_member_assets_results_response_array.g.dart';

/// UpdateMemberAssetsResultsResponseArray
///
/// Properties:
/// * [items] - List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
@BuiltValue()
abstract class UpdateMemberAssetsResultsResponseArray implements Built<UpdateMemberAssetsResultsResponseArray, UpdateMemberAssetsResultsResponseArrayBuilder> {
  /// List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
  @BuiltValueField(wireName: r'items')
  BuiltList<UpdateMemberAssetResultItem>? get items;

  UpdateMemberAssetsResultsResponseArray._();

  factory UpdateMemberAssetsResultsResponseArray([void updates(UpdateMemberAssetsResultsResponseArrayBuilder b)]) = _$UpdateMemberAssetsResultsResponseArray;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateMemberAssetsResultsResponseArrayBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateMemberAssetsResultsResponseArray> get serializer => _$UpdateMemberAssetsResultsResponseArraySerializer();
}

class _$UpdateMemberAssetsResultsResponseArraySerializer implements PrimitiveSerializer<UpdateMemberAssetsResultsResponseArray> {
  @override
  final Iterable<Type> types = const [UpdateMemberAssetsResultsResponseArray, _$UpdateMemberAssetsResultsResponseArray];

  @override
  final String wireName = r'UpdateMemberAssetsResultsResponseArray';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateMemberAssetsResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(UpdateMemberAssetResultItem)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdateMemberAssetsResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateMemberAssetsResultsResponseArrayBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(UpdateMemberAssetResultItem)]),
          ) as BuiltList<UpdateMemberAssetResultItem>?;
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
  UpdateMemberAssetsResultsResponseArray deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateMemberAssetsResultsResponseArrayBuilder();
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

