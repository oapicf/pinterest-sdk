//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_credit_redeem_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [offerCodeHash] - Takes in a SHA256 hash of the offerCode.
/// * [validateOnly] - If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
@BuiltValue()
abstract class AdsCreditRedeemCreate implements Built<AdsCreditRedeemCreate, AdsCreditRedeemCreateBuilder> {
  /// Takes in a SHA256 hash of the offerCode.
  @BuiltValueField(wireName: r'offerCodeHash')
  String get offerCodeHash;

  /// If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
  @BuiltValueField(wireName: r'validateOnly')
  bool get validateOnly;

  AdsCreditRedeemCreate._();

  factory AdsCreditRedeemCreate([void updates(AdsCreditRedeemCreateBuilder b)]) = _$AdsCreditRedeemCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdsCreditRedeemCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdsCreditRedeemCreate> get serializer => _$AdsCreditRedeemCreateSerializer();
}

class _$AdsCreditRedeemCreateSerializer implements PrimitiveSerializer<AdsCreditRedeemCreate> {
  @override
  final Iterable<Type> types = const [AdsCreditRedeemCreate, _$AdsCreditRedeemCreate];

  @override
  final String wireName = r'AdsCreditRedeemCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdsCreditRedeemCreate object, {
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
    AdsCreditRedeemCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdsCreditRedeemCreateBuilder result,
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
  AdsCreditRedeemCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdsCreditRedeemCreateBuilder();
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

