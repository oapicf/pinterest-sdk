//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_member_assets_summary_ad_accounts_inner.g.dart';

/// BusinessMemberAssetsSummaryAdAccountsInner
///
/// Properties:
/// * [id] - Unique identifier of a business ad account.
/// * [permissions] - Permission levels member or partner has on an asset.
@BuiltValue()
abstract class BusinessMemberAssetsSummaryAdAccountsInner implements Built<BusinessMemberAssetsSummaryAdAccountsInner, BusinessMemberAssetsSummaryAdAccountsInnerBuilder> {
  /// Unique identifier of a business ad account.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Permission levels member or partner has on an asset.
  @BuiltValueField(wireName: r'permissions')
  BuiltList<String>? get permissions;

  BusinessMemberAssetsSummaryAdAccountsInner._();

  factory BusinessMemberAssetsSummaryAdAccountsInner([void updates(BusinessMemberAssetsSummaryAdAccountsInnerBuilder b)]) = _$BusinessMemberAssetsSummaryAdAccountsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BusinessMemberAssetsSummaryAdAccountsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BusinessMemberAssetsSummaryAdAccountsInner> get serializer => _$BusinessMemberAssetsSummaryAdAccountsInnerSerializer();
}

class _$BusinessMemberAssetsSummaryAdAccountsInnerSerializer implements PrimitiveSerializer<BusinessMemberAssetsSummaryAdAccountsInner> {
  @override
  final Iterable<Type> types = const [BusinessMemberAssetsSummaryAdAccountsInner, _$BusinessMemberAssetsSummaryAdAccountsInner];

  @override
  final String wireName = r'BusinessMemberAssetsSummaryAdAccountsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BusinessMemberAssetsSummaryAdAccountsInner object, {
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
    BusinessMemberAssetsSummaryAdAccountsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BusinessMemberAssetsSummaryAdAccountsInnerBuilder result,
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
  BusinessMemberAssetsSummaryAdAccountsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BusinessMemberAssetsSummaryAdAccountsInnerBuilder();
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

