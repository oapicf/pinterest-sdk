//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/total_count_by_entity_status.dart';
import 'package:openapi/src/model/asset_id_permissions.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_member_assets_get_response.g.dart';

/// Paginated response for business member assets with total count metadata.
///
/// Properties:
/// * [bookmark] 
/// * [items] 
/// * [totalDataCount] - Total number of assets matching the query
/// * [totalDataCountByStatus] - Breakdown of asset counts by entity status (ad accounts only)
@BuiltValue()
abstract class BusinessMemberAssetsGetResponse implements Built<BusinessMemberAssetsGetResponse, BusinessMemberAssetsGetResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<AssetIdPermissions> get items;

  /// Total number of assets matching the query
  @BuiltValueField(wireName: r'total_data_count')
  int get totalDataCount;

  /// Breakdown of asset counts by entity status (ad accounts only)
  @BuiltValueField(wireName: r'total_data_count_by_status')
  TotalCountByEntityStatus? get totalDataCountByStatus;

  BusinessMemberAssetsGetResponse._();

  factory BusinessMemberAssetsGetResponse([void updates(BusinessMemberAssetsGetResponseBuilder b)]) = _$BusinessMemberAssetsGetResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BusinessMemberAssetsGetResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BusinessMemberAssetsGetResponse> get serializer => _$BusinessMemberAssetsGetResponseSerializer();
}

class _$BusinessMemberAssetsGetResponseSerializer implements PrimitiveSerializer<BusinessMemberAssetsGetResponse> {
  @override
  final Iterable<Type> types = const [BusinessMemberAssetsGetResponse, _$BusinessMemberAssetsGetResponse];

  @override
  final String wireName = r'BusinessMemberAssetsGetResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BusinessMemberAssetsGetResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bookmark != null) {
      yield r'bookmark';
      yield serializers.serialize(
        object.bookmark,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(AssetIdPermissions)]),
    );
    yield r'total_data_count';
    yield serializers.serialize(
      object.totalDataCount,
      specifiedType: const FullType(int),
    );
    if (object.totalDataCountByStatus != null) {
      yield r'total_data_count_by_status';
      yield serializers.serialize(
        object.totalDataCountByStatus,
        specifiedType: const FullType(TotalCountByEntityStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BusinessMemberAssetsGetResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BusinessMemberAssetsGetResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bookmark':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bookmark = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AssetIdPermissions)]),
          ) as BuiltList<AssetIdPermissions>;
          result.items.replace(valueDes);
          break;
        case r'total_data_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.totalDataCount = valueDes;
          break;
        case r'total_data_count_by_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TotalCountByEntityStatus),
          ) as TotalCountByEntityStatus?;
          if (valueDes == null) continue;
          result.totalDataCountByStatus.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BusinessMemberAssetsGetResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BusinessMemberAssetsGetResponseBuilder();
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

