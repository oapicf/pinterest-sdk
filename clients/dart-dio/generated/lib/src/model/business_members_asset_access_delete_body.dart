//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/delete_member_asset_access_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_members_asset_access_delete_body.g.dart';

/// An object with a list of member asset accesses to delete.
///
/// Properties:
/// * [accesses] - List of members asset access to be deleted
@BuiltValue()
abstract class BusinessMembersAssetAccessDeleteBody implements Built<BusinessMembersAssetAccessDeleteBody, BusinessMembersAssetAccessDeleteBodyBuilder> {
  /// List of members asset access to be deleted
  @BuiltValueField(wireName: r'accesses')
  BuiltList<DeleteMemberAssetAccessItem> get accesses;

  BusinessMembersAssetAccessDeleteBody._();

  factory BusinessMembersAssetAccessDeleteBody([void updates(BusinessMembersAssetAccessDeleteBodyBuilder b)]) = _$BusinessMembersAssetAccessDeleteBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BusinessMembersAssetAccessDeleteBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BusinessMembersAssetAccessDeleteBody> get serializer => _$BusinessMembersAssetAccessDeleteBodySerializer();
}

class _$BusinessMembersAssetAccessDeleteBodySerializer implements PrimitiveSerializer<BusinessMembersAssetAccessDeleteBody> {
  @override
  final Iterable<Type> types = const [BusinessMembersAssetAccessDeleteBody, _$BusinessMembersAssetAccessDeleteBody];

  @override
  final String wireName = r'BusinessMembersAssetAccessDeleteBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BusinessMembersAssetAccessDeleteBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'accesses';
    yield serializers.serialize(
      object.accesses,
      specifiedType: const FullType(BuiltList, [FullType(DeleteMemberAssetAccessItem)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BusinessMembersAssetAccessDeleteBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BusinessMembersAssetAccessDeleteBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'accesses':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(DeleteMemberAssetAccessItem)]),
          ) as BuiltList<DeleteMemberAssetAccessItem>;
          result.accesses.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BusinessMembersAssetAccessDeleteBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BusinessMembersAssetAccessDeleteBodyBuilder();
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

