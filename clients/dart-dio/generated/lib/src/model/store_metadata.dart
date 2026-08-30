//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'store_metadata.g.dart';

/// Store metadata for a specific store location
///
/// Properties:
/// * [geohash] - Geohash of the store location
/// * [latitude] - Geographic latitude coordinate of the store
/// * [longitude] - Geographic longitude coordinate of the store
/// * [storeCode] - Merchant provided store code
/// * [storeId] - Internal store code
/// * [storeName] - Store name
@BuiltValue()
abstract class StoreMetadata implements Built<StoreMetadata, StoreMetadataBuilder> {
  /// Geohash of the store location
  @BuiltValueField(wireName: r'geohash')
  String? get geohash;

  /// Geographic latitude coordinate of the store
  @BuiltValueField(wireName: r'latitude')
  double? get latitude;

  /// Geographic longitude coordinate of the store
  @BuiltValueField(wireName: r'longitude')
  double? get longitude;

  /// Merchant provided store code
  @BuiltValueField(wireName: r'store_code')
  String get storeCode;

  /// Internal store code
  @BuiltValueField(wireName: r'store_id')
  String get storeId;

  /// Store name
  @BuiltValueField(wireName: r'store_name')
  String? get storeName;

  StoreMetadata._();

  factory StoreMetadata([void updates(StoreMetadataBuilder b)]) = _$StoreMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(StoreMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<StoreMetadata> get serializer => _$StoreMetadataSerializer();
}

class _$StoreMetadataSerializer implements PrimitiveSerializer<StoreMetadata> {
  @override
  final Iterable<Type> types = const [StoreMetadata, _$StoreMetadata];

  @override
  final String wireName = r'StoreMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    StoreMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.geohash != null) {
      yield r'geohash';
      yield serializers.serialize(
        object.geohash,
        specifiedType: const FullType(String),
      );
    }
    if (object.latitude != null) {
      yield r'latitude';
      yield serializers.serialize(
        object.latitude,
        specifiedType: const FullType(double),
      );
    }
    if (object.longitude != null) {
      yield r'longitude';
      yield serializers.serialize(
        object.longitude,
        specifiedType: const FullType(double),
      );
    }
    yield r'store_code';
    yield serializers.serialize(
      object.storeCode,
      specifiedType: const FullType(String),
    );
    yield r'store_id';
    yield serializers.serialize(
      object.storeId,
      specifiedType: const FullType(String),
    );
    if (object.storeName != null) {
      yield r'store_name';
      yield serializers.serialize(
        object.storeName,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    StoreMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required StoreMetadataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'geohash':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.geohash = valueDes;
          break;
        case r'latitude':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.latitude = valueDes;
          break;
        case r'longitude':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.longitude = valueDes;
          break;
        case r'store_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.storeCode = valueDes;
          break;
        case r'store_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.storeId = valueDes;
          break;
        case r'store_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.storeName = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  StoreMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = StoreMetadataBuilder();
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

