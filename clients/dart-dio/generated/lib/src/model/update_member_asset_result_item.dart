//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/users_for_individual_asset_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_member_asset_result_item.g.dart';

/// UpdateMemberAssetResultItem
///
/// Properties:
/// * [response] 
@BuiltValue()
abstract class UpdateMemberAssetResultItem implements Built<UpdateMemberAssetResultItem, UpdateMemberAssetResultItemBuilder> {
  @BuiltValueField(wireName: r'response')
  UsersForIndividualAssetResponse? get response;

  UpdateMemberAssetResultItem._();

  factory UpdateMemberAssetResultItem([void updates(UpdateMemberAssetResultItemBuilder b)]) = _$UpdateMemberAssetResultItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateMemberAssetResultItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateMemberAssetResultItem> get serializer => _$UpdateMemberAssetResultItemSerializer();
}

class _$UpdateMemberAssetResultItemSerializer implements PrimitiveSerializer<UpdateMemberAssetResultItem> {
  @override
  final Iterable<Type> types = const [UpdateMemberAssetResultItem, _$UpdateMemberAssetResultItem];

  @override
  final String wireName = r'UpdateMemberAssetResultItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateMemberAssetResultItem object, {
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
    UpdateMemberAssetResultItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateMemberAssetResultItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'response':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(UsersForIndividualAssetResponse),
          ) as UsersForIndividualAssetResponse?;
          if (valueDes == null) continue;
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
  UpdateMemberAssetResultItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateMemberAssetResultItemBuilder();
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

