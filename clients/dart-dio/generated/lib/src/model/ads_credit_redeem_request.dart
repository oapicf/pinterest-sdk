//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_credit_redeem_request.g.dart';

/// AdsCreditRedeemRequest
///
/// Properties:
/// * [offerCodeHash] - Takes in a SHA256 hash of the offerCode.
/// * [validateOnly] - If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
@BuiltValue()
abstract class AdsCreditRedeemRequest implements Built<AdsCreditRedeemRequest, AdsCreditRedeemRequestBuilder> {
  /// Takes in a SHA256 hash of the offerCode.
  @BuiltValueField(wireName: r'offerCodeHash')
  String get offerCodeHash;

  /// If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
  @BuiltValueField(wireName: r'validateOnly')
  bool get validateOnly;

  AdsCreditRedeemRequest._();

  factory AdsCreditRedeemRequest([void updates(AdsCreditRedeemRequestBuilder b)]) = _$AdsCreditRedeemRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdsCreditRedeemRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdsCreditRedeemRequest> get serializer => _$AdsCreditRedeemRequestSerializer();
}

class _$AdsCreditRedeemRequestSerializer implements PrimitiveSerializer<AdsCreditRedeemRequest> {
  @override
  final Iterable<Type> types = const [AdsCreditRedeemRequest, _$AdsCreditRedeemRequest];

  @override
  final String wireName = r'AdsCreditRedeemRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdsCreditRedeemRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'offerCodeHash';
    yield serializers.serialize(
      object.offerCodeHash,
      specifiedType: const FullType(String),
    );
    yield r'validateOnly';
    yield serializers.serialize(
      object.validateOnly,
      specifiedType: const FullType(bool),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdsCreditRedeemRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdsCreditRedeemRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'offerCodeHash':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.offerCodeHash = valueDes;
          break;
        case r'validateOnly':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.validateOnly = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdsCreditRedeemRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdsCreditRedeemRequestBuilder();
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

