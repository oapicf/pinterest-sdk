//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_assets_summary_ad_accounts_inner.g.dart';

/// InviteAssetsSummaryAdAccountsInner
///
/// Properties:
/// * [id] - Unique identifier of a business ad account.
/// * [permissions] - Permission levels member or partner has on an asset.
@BuiltValue()
abstract class InviteAssetsSummaryAdAccountsInner implements Built<InviteAssetsSummaryAdAccountsInner, InviteAssetsSummaryAdAccountsInnerBuilder> {
  /// Unique identifier of a business ad account.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Permission levels member or partner has on an asset.
  @BuiltValueField(wireName: r'permissions')
  BuiltList<String>? get permissions;

  InviteAssetsSummaryAdAccountsInner._();

  factory InviteAssetsSummaryAdAccountsInner([void updates(InviteAssetsSummaryAdAccountsInnerBuilder b)]) = _$InviteAssetsSummaryAdAccountsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteAssetsSummaryAdAccountsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InviteAssetsSummaryAdAccountsInner> get serializer => _$InviteAssetsSummaryAdAccountsInnerSerializer();
}

class _$InviteAssetsSummaryAdAccountsInnerSerializer implements PrimitiveSerializer<InviteAssetsSummaryAdAccountsInner> {
  @override
  final Iterable<Type> types = const [InviteAssetsSummaryAdAccountsInner, _$InviteAssetsSummaryAdAccountsInner];

  @override
  final String wireName = r'InviteAssetsSummaryAdAccountsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InviteAssetsSummaryAdAccountsInner object, {
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
    InviteAssetsSummaryAdAccountsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteAssetsSummaryAdAccountsInnerBuilder result,
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
  InviteAssetsSummaryAdAccountsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteAssetsSummaryAdAccountsInnerBuilder();
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

