//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_assets_summary_profiles_inner.g.dart';

/// InviteAssetsSummaryProfilesInner
///
/// Properties:
/// * [id] - Unique identifier of a business profile.
/// * [permissions] - Permission levels member or partner has on an asset.
@BuiltValue()
abstract class InviteAssetsSummaryProfilesInner implements Built<InviteAssetsSummaryProfilesInner, InviteAssetsSummaryProfilesInnerBuilder> {
  /// Unique identifier of a business profile.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Permission levels member or partner has on an asset.
  @BuiltValueField(wireName: r'permissions')
  BuiltList<String>? get permissions;

  InviteAssetsSummaryProfilesInner._();

  factory InviteAssetsSummaryProfilesInner([void updates(InviteAssetsSummaryProfilesInnerBuilder b)]) = _$InviteAssetsSummaryProfilesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteAssetsSummaryProfilesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InviteAssetsSummaryProfilesInner> get serializer => _$InviteAssetsSummaryProfilesInnerSerializer();
}

class _$InviteAssetsSummaryProfilesInnerSerializer implements PrimitiveSerializer<InviteAssetsSummaryProfilesInner> {
  @override
  final Iterable<Type> types = const [InviteAssetsSummaryProfilesInner, _$InviteAssetsSummaryProfilesInner];

  @override
  final String wireName = r'InviteAssetsSummaryProfilesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InviteAssetsSummaryProfilesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.permissions != null) {
      yield r'permissions';
      yield serializers.serialize(
        object.permissions,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    InviteAssetsSummaryProfilesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteAssetsSummaryProfilesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'permissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.permissions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  InviteAssetsSummaryProfilesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteAssetsSummaryProfilesInnerBuilder();
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

