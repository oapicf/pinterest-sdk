//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ssio_account_item.dart';
import 'package:openapi/src/model/ssio_account_pmp_name.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_account.g.dart';

/// Salesforce account details including bill-to information.
///
/// Properties:
/// * [billtoInfos] - An array of Salesforce account information that includes address, io terms, etc.
/// * [canEdit] - Advertiser eligible to update order lines
/// * [currency] 
/// * [eligible] - Advertiser eligible to create order lines
/// * [error] - Error indicator from Salesforce which could be \"No Error\"
/// * [pmpNames] 
@BuiltValue()
abstract class SSIOAccount implements Built<SSIOAccount, SSIOAccountBuilder> {
  /// An array of Salesforce account information that includes address, io terms, etc.
  @BuiltValueField(wireName: r'billto_infos')
  BuiltList<SSIOAccountItem>? get billtoInfos;

  /// Advertiser eligible to update order lines
  @BuiltValueField(wireName: r'can_edit')
  bool? get canEdit;

  @BuiltValueField(wireName: r'currency')
  String? get currency;

  /// Advertiser eligible to create order lines
  @BuiltValueField(wireName: r'eligible')
  bool? get eligible;

  /// Error indicator from Salesforce which could be \"No Error\"
  @BuiltValueField(wireName: r'error')
  String? get error;

  @BuiltValueField(wireName: r'pmp_names')
  BuiltList<SSIOAccountPMPName>? get pmpNames;

  SSIOAccount._();

  factory SSIOAccount([void updates(SSIOAccountBuilder b)]) = _$SSIOAccount;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SSIOAccountBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SSIOAccount> get serializer => _$SSIOAccountSerializer();
}

class _$SSIOAccountSerializer implements PrimitiveSerializer<SSIOAccount> {
  @override
  final Iterable<Type> types = const [SSIOAccount, _$SSIOAccount];

  @override
  final String wireName = r'SSIOAccount';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SSIOAccount object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.billtoInfos != null) {
      yield r'billto_infos';
      yield serializers.serialize(
        object.billtoInfos,
        specifiedType: const FullType(BuiltList, [FullType(SSIOAccountItem)]),
      );
    }
    if (object.canEdit != null) {
      yield r'can_edit';
      yield serializers.serialize(
        object.canEdit,
        specifiedType: const FullType(bool),
      );
    }
    if (object.currency != null) {
      yield r'currency';
      yield serializers.serialize(
        object.currency,
        specifiedType: const FullType(String),
      );
    }
    if (object.eligible != null) {
      yield r'eligible';
      yield serializers.serialize(
        object.eligible,
        specifiedType: const FullType(bool),
      );
    }
    if (object.error != null) {
      yield r'error';
      yield serializers.serialize(
        object.error,
        specifiedType: const FullType(String),
      );
    }
    if (object.pmpNames != null) {
      yield r'pmp_names';
      yield serializers.serialize(
        object.pmpNames,
        specifiedType: const FullType(BuiltList, [FullType(SSIOAccountPMPName)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SSIOAccount object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SSIOAccountBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'billto_infos':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(SSIOAccountItem)]),
          ) as BuiltList<SSIOAccountItem>?;
          if (valueDes == null) continue;
          result.billtoInfos.replace(valueDes);
          break;
        case r'can_edit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.canEdit = valueDes;
          break;
        case r'currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.currency = valueDes;
          break;
        case r'eligible':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.eligible = valueDes;
          break;
        case r'error':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.error = valueDes;
          break;
        case r'pmp_names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(SSIOAccountPMPName)]),
          ) as BuiltList<SSIOAccountPMPName>?;
          if (valueDes == null) continue;
          result.pmpNames.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SSIOAccount deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SSIOAccountBuilder();
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

