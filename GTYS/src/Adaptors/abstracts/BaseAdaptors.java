package Adaptors.abstracts;

import java.rmi.RemoteException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Entities.abstracts.PersonEntity;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public abstract class BaseAdaptors {

	public boolean checkIfRealPerson(PersonEntity entity)throws NumberFormatException, RemoteException {
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(entity.getEmail());
		boolean isTrue = matcher.find();
		return isTrue;
	}
	public boolean checkEmail(PersonEntity entity) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(entity.getNationalId())
                , entity.getFirstName().toUpperCase()
                ,entity.getFirstName().toUpperCase()
                ,entity.getbirthYear());
	}

}
