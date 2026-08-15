//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/users_for_individual_asset_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_member_assets_results_response_array_items_inner.g.dart';

/// UpdateMemberAssetsResultsResponseArrayItemsInner
///
/// Properties:
/// * [response] 
@BuiltValue()
abstract class UpdateMemberAssetsResultsResponseArrayItemsInner implements Built<UpdateMemberAssetsResultsResponseArrayItemsInner, UpdateMemberAssetsResultsResponseArrayItemsInnerBuilder> {
  @BuiltValueField(wireName: r'response')
  UsersForIndividualAssetResponse? get response;

  UpdateMemberAssetsResultsResponseArrayItemsInner._();

  factory UpdateMemberAssetsResultsResponseArrayItemsInner([void updates(UpdateMemberAssetsResultsResponseArrayItemsInnerBuilder b)]) = _$UpdateMemberAssetsResultsResponseArrayItemsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateMemberAssetsResultsResponseArrayItemsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateMemberAssetsResultsResponseArrayItemsInner> get serializer => _$UpdateMemberAssetsResultsResponseArrayItemsInnerSerializer();
}

class _$UpdateMemberAssetsResultsResponseArrayItemsInnerSerializer implements PrimitiveSerializer<UpdateMemberAssetsResultsResponseArrayItemsInner> {
  @override
  final Iterable<Type> types = const [UpdateMemberAssetsResultsResponseArrayItemsInner, _$UpdateMemberAssetsResultsResponseArrayItemsInner];

  @override
  final String wireName = r'UpdateMemberAssetsResultsResponseArrayItemsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateMemberAssetsResultsResponseArrayItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.response != null) {
      yield r'response';
      yield serializers.serialize(
        object.response,
        specifiedType: const FullType(UsersForIndividualAssetResponse),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdateMemberAssetsResultsResponseArrayItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateMemberAssetsResultsResponseArrayItemsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'response':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UsersForIndividualAssetResponse),
          ) as UsersForIndividualAssetResponse;
          result.response.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UpdateMemberAssetsResultsResponseArrayItemsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateMemberAssetsResultsResponseArrayItemsInnerBuilder();
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

