//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_member_access_result.g.dart';

/// The terminated asset access.
///
/// Properties:
/// * [assetId] - Unique identifier of the business asset.
/// * [memberId] - Unique identifier of the business member.
@BuiltValue()
abstract class DeleteMemberAccessResult implements Built<DeleteMemberAccessResult, DeleteMemberAccessResultBuilder> {
  /// Unique identifier of the business asset.
  @BuiltValueField(wireName: r'asset_id')
  String? get assetId;

  /// Unique identifier of the business member.
  @BuiltValueField(wireName: r'member_id')
  String? get memberId;

  DeleteMemberAccessResult._();

  factory DeleteMemberAccessResult([void updates(DeleteMemberAccessResultBuilder b)]) = _$DeleteMemberAccessResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteMemberAccessResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteMemberAccessResult> get serializer => _$DeleteMemberAccessResultSerializer();
}

class _$DeleteMemberAccessResultSerializer implements PrimitiveSerializer<DeleteMemberAccessResult> {
  @override
  final Iterable<Type> types = const [DeleteMemberAccessResult, _$DeleteMemberAccessResult];

  @override
  final String wireName = r'DeleteMemberAccessResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteMemberAccessResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.assetId != null) {
      yield r'asset_id';
      yield serializers.serialize(
        object.assetId,
        specifiedType: const FullType(String),
      );
    }
    if (object.memberId != null) {
      yield r'member_id';
      yield serializers.serialize(
        object.memberId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteMemberAccessResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteMemberAccessResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.assetId = valueDes;
          break;
        case r'member_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.memberId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeleteMemberAccessResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteMemberAccessResultBuilder();
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

