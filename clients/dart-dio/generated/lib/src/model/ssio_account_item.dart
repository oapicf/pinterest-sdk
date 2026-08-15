//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ssio_account_address.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_account_item.g.dart';

/// SSIOAccountItem
///
/// Properties:
/// * [addresses] - Address information that is associated with this account.
/// * [id] - Salesforce id for billto_info
/// * [ioTerms] - Salesforce text for IO Terms and Conditions
/// * [ioTermsId] - Salesforce id for IO Terms and Conditions
/// * [ioType] - Insertion Order Type - Pinterest Paper or Agency Paper
/// * [rowTerms] - Salesforce text for Rest of the World Terms and Conditions
/// * [rowTermsId] - Salesforce id for Rest of the World Terms and Conditions
/// * [usTerms] - Salesforce text for US Terms and Conditions
/// * [usTermsId] - Salesforce id for US Terms and Conditions
@BuiltValue()
abstract class SSIOAccountItem implements Built<SSIOAccountItem, SSIOAccountItemBuilder> {
  /// Address information that is associated with this account.
  @BuiltValueField(wireName: r'addresses')
  BuiltList<SSIOAccountAddress>? get addresses;

  /// Salesforce id for billto_info
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Salesforce text for IO Terms and Conditions
  @BuiltValueField(wireName: r'io_terms')
  String? get ioTerms;

  /// Salesforce id for IO Terms and Conditions
  @BuiltValueField(wireName: r'io_terms_id')
  String? get ioTermsId;

  /// Insertion Order Type - Pinterest Paper or Agency Paper
  @BuiltValueField(wireName: r'io_type')
  String? get ioType;

  /// Salesforce text for Rest of the World Terms and Conditions
  @BuiltValueField(wireName: r'row_terms')
  String? get rowTerms;

  /// Salesforce id for Rest of the World Terms and Conditions
  @BuiltValueField(wireName: r'row_terms_id')
  String? get rowTermsId;

  /// Salesforce text for US Terms and Conditions
  @BuiltValueField(wireName: r'us_terms')
  String? get usTerms;

  /// Salesforce id for US Terms and Conditions
  @BuiltValueField(wireName: r'us_terms_id')
  String? get usTermsId;

  SSIOAccountItem._();

  factory SSIOAccountItem([void updates(SSIOAccountItemBuilder b)]) = _$SSIOAccountItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SSIOAccountItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SSIOAccountItem> get serializer => _$SSIOAccountItemSerializer();
}

class _$SSIOAccountItemSerializer implements PrimitiveSerializer<SSIOAccountItem> {
  @override
  final Iterable<Type> types = const [SSIOAccountItem, _$SSIOAccountItem];

  @override
  final String wireName = r'SSIOAccountItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SSIOAccountItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.addresses != null) {
      yield r'addresses';
      yield serializers.serialize(
        object.addresses,
        specifiedType: const FullType(BuiltList, [FullType(SSIOAccountAddress)]),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.ioTerms != null) {
      yield r'io_terms';
      yield serializers.serialize(
        object.ioTerms,
        specifiedType: const FullType(String),
      );
    }
    if (object.ioTermsId != null) {
      yield r'io_terms_id';
      yield serializers.serialize(
        object.ioTermsId,
        specifiedType: const FullType(String),
      );
    }
    if (object.ioType != null) {
      yield r'io_type';
      yield serializers.serialize(
        object.ioType,
        specifiedType: const FullType(String),
      );
    }
    if (object.rowTerms != null) {
      yield r'row_terms';
      yield serializers.serialize(
        object.rowTerms,
        specifiedType: const FullType(String),
      );
    }
    if (object.rowTermsId != null) {
      yield r'row_terms_id';
      yield serializers.serialize(
        object.rowTermsId,
        specifiedType: const FullType(String),
      );
    }
    if (object.usTerms != null) {
      yield r'us_terms';
      yield serializers.serialize(
        object.usTerms,
        specifiedType: const FullType(String),
      );
    }
    if (object.usTermsId != null) {
      yield r'us_terms_id';
      yield serializers.serialize(
        object.usTermsId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SSIOAccountItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SSIOAccountItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'addresses':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(SSIOAccountAddress)]),
          ) as BuiltList<SSIOAccountAddress>;
          result.addresses.replace(valueDes);
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'io_terms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.ioTerms = valueDes;
          break;
        case r'io_terms_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.ioTermsId = valueDes;
          break;
        case r'io_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.ioType = valueDes;
          break;
        case r'row_terms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.rowTerms = valueDes;
          break;
        case r'row_terms_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.rowTermsId = valueDes;
          break;
        case r'us_terms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.usTerms = valueDes;
          break;
        case r'us_terms_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.usTermsId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SSIOAccountItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SSIOAccountItemBuilder();
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

