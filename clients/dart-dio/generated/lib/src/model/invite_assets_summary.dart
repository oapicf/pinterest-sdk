//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/invite_assets_summary_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_assets_summary.g.dart';

/// Ad accounts and profiles the member/partner will be granted access to with this invite/request.
///
/// Properties:
/// * [adAccounts] - List of ad account IDs and respective permission levels that will be assigned.
/// * [profiles] - List of profile IDs and respective permission levels that will be assigned.
@BuiltValue()
abstract class InviteAssetsSummary implements Built<InviteAssetsSummary, InviteAssetsSummaryBuilder> {
  /// List of ad account IDs and respective permission levels that will be assigned.
  @BuiltValueField(wireName: r'ad_accounts')
  BuiltList<InviteAssetsSummaryItem>? get adAccounts;

  /// List of profile IDs and respective permission levels that will be assigned.
  @BuiltValueField(wireName: r'profiles')
  BuiltList<InviteAssetsSummaryItem>? get profiles;

  InviteAssetsSummary._();

  factory InviteAssetsSummary([void updates(InviteAssetsSummaryBuilder b)]) = _$InviteAssetsSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteAssetsSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InviteAssetsSummary> get serializer => _$InviteAssetsSummarySerializer();
}

class _$InviteAssetsSummarySerializer implements PrimitiveSerializer<InviteAssetsSummary> {
  @override
  final Iterable<Type> types = const [InviteAssetsSummary, _$InviteAssetsSummary];

  @override
  final String wireName = r'InviteAssetsSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InviteAssetsSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccounts != null) {
      yield r'ad_accounts';
      yield serializers.serialize(
        object.adAccounts,
        specifiedType: const FullType(BuiltList, [FullType(InviteAssetsSummaryItem)]),
      );
    }
    if (object.profiles != null) {
      yield r'profiles';
      yield serializers.serialize(
        object.profiles,
        specifiedType: const FullType(BuiltList, [FullType(InviteAssetsSummaryItem)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    InviteAssetsSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteAssetsSummaryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_accounts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(InviteAssetsSummaryItem)]),
          ) as BuiltList<InviteAssetsSummaryItem>?;
          if (valueDes == null) continue;
          result.adAccounts.replace(valueDes);
          break;
        case r'profiles':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(InviteAssetsSummaryItem)]),
          ) as BuiltList<InviteAssetsSummaryItem>?;
          if (valueDes == null) continue;
          result.profiles.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  InviteAssetsSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteAssetsSummaryBuilder();
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

