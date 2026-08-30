//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'amazon_connect_request.g.dart';

/// Request containing OTP and Amazon storefront info called by Amazon
///
/// Properties:
/// * [amazonStorefrontId] - The Amazon storefront id
/// * [amazonStorefrontName] - The Amazon storefront name
/// * [amazonStorefrontUrl] - The Amazon storefront url
/// * [amazonUserId] - The Amazon user id
/// * [isAmazonAccountLinked] - The Amazon account linking status
/// * [oneTimePasscode] - The one time passcode for Pinterest-initiated linking requests
/// * [pinterestUserId] - The Pinterest user id for Amazon-initiated linking requests
@BuiltValue()
abstract class AmazonConnectRequest implements Built<AmazonConnectRequest, AmazonConnectRequestBuilder> {
  /// The Amazon storefront id
  @BuiltValueField(wireName: r'amazon_storefront_id')
  String? get amazonStorefrontId;

  /// The Amazon storefront name
  @BuiltValueField(wireName: r'amazon_storefront_name')
  String get amazonStorefrontName;

  /// The Amazon storefront url
  @BuiltValueField(wireName: r'amazon_storefront_url')
  String get amazonStorefrontUrl;

  /// The Amazon user id
  @BuiltValueField(wireName: r'amazon_user_id')
  String? get amazonUserId;

  /// The Amazon account linking status
  @BuiltValueField(wireName: r'is_amazon_account_linked')
  bool get isAmazonAccountLinked;

  /// The one time passcode for Pinterest-initiated linking requests
  @BuiltValueField(wireName: r'one_time_passcode')
  String? get oneTimePasscode;

  /// The Pinterest user id for Amazon-initiated linking requests
  @BuiltValueField(wireName: r'pinterest_user_id')
  String? get pinterestUserId;

  AmazonConnectRequest._();

  factory AmazonConnectRequest([void updates(AmazonConnectRequestBuilder b)]) = _$AmazonConnectRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AmazonConnectRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AmazonConnectRequest> get serializer => _$AmazonConnectRequestSerializer();
}

class _$AmazonConnectRequestSerializer implements PrimitiveSerializer<AmazonConnectRequest> {
  @override
  final Iterable<Type> types = const [AmazonConnectRequest, _$AmazonConnectRequest];

  @override
  final String wireName = r'AmazonConnectRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AmazonConnectRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.amazonStorefrontId != null) {
      yield r'amazon_storefront_id';
      yield serializers.serialize(
        object.amazonStorefrontId,
        specifiedType: const FullType(String),
      );
    }
    yield r'amazon_storefront_name';
    yield serializers.serialize(
      object.amazonStorefrontName,
      specifiedType: const FullType(String),
    );
    yield r'amazon_storefront_url';
    yield serializers.serialize(
      object.amazonStorefrontUrl,
      specifiedType: const FullType(String),
    );
    if (object.amazonUserId != null) {
      yield r'amazon_user_id';
      yield serializers.serialize(
        object.amazonUserId,
        specifiedType: const FullType(String),
      );
    }
    yield r'is_amazon_account_linked';
    yield serializers.serialize(
      object.isAmazonAccountLinked,
      specifiedType: const FullType(bool),
    );
    if (object.oneTimePasscode != null) {
      yield r'one_time_passcode';
      yield serializers.serialize(
        object.oneTimePasscode,
        specifiedType: const FullType(String),
      );
    }
    if (object.pinterestUserId != null) {
      yield r'pinterest_user_id';
      yield serializers.serialize(
        object.pinterestUserId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AmazonConnectRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AmazonConnectRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'amazon_storefront_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.amazonStorefrontId = valueDes;
          break;
        case r'amazon_storefront_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.amazonStorefrontName = valueDes;
          break;
        case r'amazon_storefront_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.amazonStorefrontUrl = valueDes;
          break;
        case r'amazon_user_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.amazonUserId = valueDes;
          break;
        case r'is_amazon_account_linked':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isAmazonAccountLinked = valueDes;
          break;
        case r'one_time_passcode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.oneTimePasscode = valueDes;
          break;
        case r'pinterest_user_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pinterestUserId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AmazonConnectRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AmazonConnectRequestBuilder();
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

